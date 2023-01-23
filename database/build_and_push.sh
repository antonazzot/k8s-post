docker build . -t epamantontsyrkunou/postdb
docker push epamantontsyrkunou/postdb
docker run -i -ti --rm --name postdb epamantontsyrkunou/postdb

