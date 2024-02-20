//Environment state subscription
EnvironmentStore.store.subscribe { state ->
    ...
        canvasCtxt.redrawNodes(state.toListOfPairs())
    ...
}

//Canvas redraw function
fun CanvasRenderingContext2D.redrawNodes(
    nodes: List<Pair<Double, Double>>
) {
    ...
    nodes.forEach {
        drawNode(Pair(it.first, it.second))
    }
    ...
}