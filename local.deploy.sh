VERSION=0.0.1
IMAGEN=kster/catalogos
NAME=catalogo
mvn package
docker service rm $NAME  || true
docker rmi $IMAGEN:$VERSION || true
docker build -t $IMAGEN:$VERSION .

docker service create \
        --name $NAME \
        --network appnet \
        --restart-condition any \
        --replicas=1  \
        --restart-delay 5s \
        --update-delay 10s \
        --update-parallelism 1 \
        --mount type=bind,source=/etc/localtime,destination=/etc/localtime \
        $IMAGEN:$VERSION
