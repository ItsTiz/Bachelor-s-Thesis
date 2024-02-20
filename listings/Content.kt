hPanel {
    add(
        SimulationContext("simulation-context").apply {
            width = 1400.px
            height = 900.px
        }
    )
    vPanel {
        width = 520.px
        height = 95.perc
        add(
            SimulationIndicators("simulation-indicators").apply {
                width = 100.perc
                height = 100.perc
            }
        )
        add(
            NodeProperties("node-properties").apply {
                width = 100.perc
                height = 100.perc
            }
        )
    }
}