flexPanel {
    div {
        width = 100.perc
        height = 100.perc
    }.bind(NodeStore.nodeStore) {
        +"id: ${it.node?.environment?.nodeById?.id}"
    }

    div {
        width = 100.perc
        height = 100.perc
    }.bind(NodeStore.nodeStore) {
        +"X: ${it.node?.nodePosition?.coordinates?.get(0)},"
        +"Y:${it.node?.nodePosition?.coordinates?.get(1)}"
    }
}