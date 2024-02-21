suspend fun getSimulationStatus(): Deferred<SimulationStatusQuery.Data?> =
	coroutineScope {
		async {
			ClientConnection.client
			.query(SimulationStatusQuery())
			.execute()
			.data
		}
	}