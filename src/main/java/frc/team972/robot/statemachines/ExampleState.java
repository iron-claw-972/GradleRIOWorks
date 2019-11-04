package frc.team972.robot.statemachines;

public enum ExampleState {
    ON, OFF;

    public ExampleState next() {
        switch (this) {
            case ON:
                return OFF;
                break;
            case OFF:
                return ON;
                break;        
        }
    }
}
