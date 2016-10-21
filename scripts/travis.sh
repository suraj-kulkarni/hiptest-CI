#!/bin/sh

gem install hiptest-publisher
hiptest-publisher -c publisher.config

mvn package
