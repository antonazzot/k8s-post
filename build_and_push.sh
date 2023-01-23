mvn clean package
docker build . -t epamantontsyrkunou/postservice-1.0.0
docker push epamantontsyrkunou/postservice-1.0.0
docker run -i -ti --rm -p 8888:8888 --env PASSWORD=postgres --env USERNAME=postgres --env URL=jdbc:postgresql://host.docker.internal:5432/postdb --env FEIGN_URL=http://host.docker.internal:7777/ --name postservice epamantontsyrkunou/postservice-1.0.0

