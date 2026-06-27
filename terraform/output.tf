output "container_id" {
  value = docker_container.app_server.id
}

output "container_name" {
  value = docker_container.app_server.name
}

output "image_name" {
  value = var.image_name
}
