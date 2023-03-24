https://leetcode.com/problems/swap-salary/description/

UPDATE SALARY
SET SEX = CASE WHEN sex = 'm' THEN 'f'
               WHEN sex = 'f' THEN 'm' else sex end
;
