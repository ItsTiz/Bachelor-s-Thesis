fun environmentSubscription(): Flow<...> {
    return ClientConnection.client
            .subscription(EnvironmentSubscription())
            .toFlow()
}