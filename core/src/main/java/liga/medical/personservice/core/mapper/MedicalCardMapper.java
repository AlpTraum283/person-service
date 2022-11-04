package liga.medical.personservice.core.mapper;

import liga.medical.personservice.core.model.MedicalCard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component
public interface MedicalCardMapper {

    @Select("Select * from medical_card")
    List<MedicalCard> getMedicalCardMyBatis();
}
