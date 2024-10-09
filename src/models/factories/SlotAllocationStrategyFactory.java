package models.factories;

import models.Strategies.SlotAllocationStrategy.FarthestSlotAllocationStrategy;
import models.Strategies.SlotAllocationStrategy.NearestSlotAllocationStrategy;
import models.Strategies.SlotAllocationStrategy.RandomSlotAllocationStrategy;
import models.Strategies.SlotAllocationStrategy.SlotAllocationStrategy;
import models.enums.SlotAllocationStrategyType;

public class SlotAllocationStrategyFactory {
        public static SlotAllocationStrategy getSlotAllocationStrategyByStrategyType(SlotAllocationStrategyType type){
            if(type == SlotAllocationStrategyType.RANDOM){
                return new RandomSlotAllocationStrategy();
            } else if(type == SlotAllocationStrategyType.NEAREST_TO_GATE){
                return new NearestSlotAllocationStrategy();
            } else if(type == SlotAllocationStrategyType.FARTHEST_FROM_GATE){
                return new FarthestSlotAllocationStrategy();
            }
            return null;
        }
    }
