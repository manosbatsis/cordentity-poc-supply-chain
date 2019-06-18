#!/usr/bin/env bash

docker-compose down --rmi local --volumes
./gradlew clean assemble
./gradlew runNodes
sleep 30
docker-compose up -d agent94 agent95 agent96 agentInitiator
docker-compose build tcweb mfweb
docker-compose up -d tcweb mfweb