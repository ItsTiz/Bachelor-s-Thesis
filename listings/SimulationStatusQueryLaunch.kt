fun callGetStatus() {
	MainScope().launch {
		val result = SimulationControlApi.getSimulationStatus().await()

		simulationStore.dispatch(SimulationAction.SetSimulation(result))
	}
}