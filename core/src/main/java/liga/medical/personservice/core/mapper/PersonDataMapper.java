package liga.medical.personservice.core.mapper;

import liga.medical.personservice.core.model.PersonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PersonDataMapper {

    @Select("Select * from person_data")
    List<PersonData> getPersonDataMyBatis();
}
