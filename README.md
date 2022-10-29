# Spring MongoDB

MongoDB is a document-oriented database. It uses the concept of the document to store data, which is more flexible than the row concept in the relational database management system (RDBMS).

A document allows you to represent complex hierarchical relationships with a single record.

MongoDB doesn’t require predefined schemas that allow you to add to or remove fields from documents more quickly.

When the database grows, you’ll have a challenge of how to scale it. There are two common ways:

- Scaling up – upgrade the current server to a bigger one with more resources (CPU, RAM, etc). However, getting a bigger server means increasing more costs.
- Scaling out – purchase additional servers and add them to the cluster. This is cheaper and more scalable than scaling up. The downside is that it takes more effort to manage multiple servers than a big one.

MongoDB was designed to scale out and it allows you to split data across many servers. It also automatically manages the load balancing across the cluster, redistributing data, and routing updates to the correct servers.

Like any database system, MongoDB allows you to insert, update, and delete, and select data. In addition, it supports other features including:

- Indexing
- Aggregation
- Specify collection and index types
- File Storage


## Start the mongodb container

run this command to start all services in the correct order.

```bash
$ docker-compose up -d
```

## Connect to the mongodb container

```bash
$ docker exec -it mongodb bash
```

### Connect to a specific database with mongodb shell

```bash
$ mongosh "mongodb://localhost:27017/spring"  --username root --password password  --authenticationDatabase admin
```

### Verify current connection

```bash
$ db.getMongo()
```

### Query collections

```bash
$ db.getCollectionNames()
```

### Create documents

```bash
$ db.users.insert({"firstName" : "John",
                   "lastName" : "Doe",
                   "userName": "john",
                   "password": "password"})
```

### Query documents

```bash
$ db.users.find()
```

## Stop the mongodb container

```bash
docker-compose down
```