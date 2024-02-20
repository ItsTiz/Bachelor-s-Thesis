EnvironmentApi.environmentSubscription().collect {
    EnvironmentStore.store.dispatch(
        EnvironmentStateAction.AddAllNodes(
            it.data?.environment?.nodeToPos!!.entries
        )
    )
}