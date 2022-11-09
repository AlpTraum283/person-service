select pd as personData, mc as medicalCard, a as address, i as illness, c as contact
from person_data pd,
     medical_card mc,
     address a,
     illness i,
     contact c
where pd.medical_card_id = mc.id
  and i.medical_card_id = mc.id
  and pd.contact_id = c.id
  and a.contact_id = c.id
