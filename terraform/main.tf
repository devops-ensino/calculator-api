terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "~> 3.0"
    }
  }
}

provider "docker" {}

resource "docker_image" "ubuntu" {
  name = var.image_name
}

resource "docker_container" "app_server" {
  name  = var.container_name
  image = docker_image.ubuntu.image_id

  ports {
        internal = 8080
        external = 4003
  }

  command = [
    "/bin/bash",
    "-c",
    "while true; do sleep 3600; done"
  ]
}
