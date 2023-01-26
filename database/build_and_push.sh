docker build . -t epamantontsyrkunou/postdb
docker push epamantontsyrkunou/postdb
docker run -i -ti --rm -p 5432:5432 --name postdb epamantontsyrkunou/postdb

