# Learn-spring-cloud-project

[![Build Status](https://travis-ci.org/tommywu23/cloud.svg?branch=master)](https://travis-ci.org/tommywu23/cloud)

Overview
===========

The fastest way to get running:

* build sc config env
* use consul to implement service discovery
* use sc config to implement configuration
* use spring-boot-actuator to implement refresh config of dynamic
* use spring-retry to solve network fluctuation and exception


Updated
===========
* use sc-bus and kafka to implement refresh config of dynamic


Env & Use Requirement
===========
* kafka 2.11-0.10.11
* need add POST /bus/refresh to Webhook for github.com project
* if you need encrypt, add encrypt.key to applicaton.yml
