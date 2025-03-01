package divinerpg.entities.iceika.gruzzorlug;

import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class GruzzorlugGeneral extends Gruzzorlug {
	public GruzzorlugGeneral(EntityType<? extends Gruzzorlug> type, Level worldIn) {
		super(type, worldIn);
		entityData.set(ITEM, 6);
		important = true;
	}
	@Override protected TagKey<Item> getAcceptedItems() {return Gruzzorlug.KNIGHT_ACCEPTED;}
	@Override protected String getTradesLocation() {return "trades/gruzzorlug_general";}
}