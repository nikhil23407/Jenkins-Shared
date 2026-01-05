def call(Map params) {
    if (!params.FRONTEND_DOCKER_TAG?.trim() || !params.BACKEND_DOCKER_TAG?.trim()) {
        error("FRONTEND_DOCKER_TAG and BACKEND_DOCKER_TAG must be provided.")
    }
}
