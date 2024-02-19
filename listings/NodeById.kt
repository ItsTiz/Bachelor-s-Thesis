fun nodeById(nodeId: Int = 0) {
    MainScope().launch {
        val result = EnvironmentApi.nodeQuery(nodeId).await()

        nodeStore.dispatch(NodeStateAction.SetNode(result))
    }
}