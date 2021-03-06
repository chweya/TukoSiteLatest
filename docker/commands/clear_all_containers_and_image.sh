#!/usr/bin/env bash
# Delete every Docker containers
# Must be run first because images are attached to containers
# shellcheck disable=SC2046
docker rm -f $(docker ps -a -q)

# Delete every Docker image
docker rmi -f $(docker images -q)