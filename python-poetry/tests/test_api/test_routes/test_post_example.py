from starlette.testclient import TestClient

from app.main import app

client = TestClient(app)


def test_post():
    resp = client.post('/post_example', json={"str_for_example": "t_e_s_t__p_o_s_t", "float_or_none_for_example": 3.0})
    assert resp.status_code == 200
    assert resp.content.decode('utf-8') == '{"str_for_example":"t_e_s_t__p_o_s_t","float_or_none_for_example":3.0}'


def test_post_no_float():
    resp = client.post('/post_example', json={"str_for_example": "t_e_s_t__p_o_s_t"})
    assert resp.status_code == 200
    assert resp.content.decode('utf-8') == '{"str_for_example":"t_e_s_t__p_o_s_t","float_or_none_for_example":null}'
