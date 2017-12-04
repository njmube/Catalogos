VERSION=0.0.1
IMAGEN=kster/catalogos
NAME=catalogo
mvn package
docker service rm $NAME  || true
docker rmi $IMAGEN:$VERSION || true
docker build -t $IMAGEN:$VERSION -f Dockerfile.dev .

docker service create \
        --name $NAME \
        --network appnet \
        --restart-condition any \
        --replicas=1  \
        --restart-delay 5s \
        --update-delay 10s \
        -p 57777:57777  \
        --update-parallelism 1 \
        $IMAGEN:$VERSION
