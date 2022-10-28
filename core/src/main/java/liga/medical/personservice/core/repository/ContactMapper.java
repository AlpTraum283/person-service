package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.model.Contact;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component
public interface ContactMapper {

    @Select("Select * from contact")
    List<Contact> getContactsMyBatis();
}
