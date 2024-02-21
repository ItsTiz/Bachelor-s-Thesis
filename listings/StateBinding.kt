div {
    ...
}.bind(NodeStore.nodeStore) {
    +"id: ${it.node?.environment?.nodeById?.id}"
}

div {
    ...
}.bind(NodeStore.nodeStore) {
    +"X: ${it.node?.nodePosition?.coordinates?.get(0)}"
    +"Y: ${it.node?.nodePosition?.coordinates?.get(1)}"
}