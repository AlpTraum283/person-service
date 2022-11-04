package liga.medical.personservice.core.mapper;

import liga.medical.personservice.core.model.Illness;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component
public interface IllnessMapper {

    @Select("Select * from illness")
    List<Illness> getIllnessesMyBatis();
}
