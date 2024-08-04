import json
from types import SimpleNamespace

from starlette.testclient import TestClient

from app.config import Config
from app.main import app

client = TestClient(app)


def test_info():
    resp = client.get('/info')
    assert resp.status_code == 200

    decoded = resp.content.decode('utf-8')
    content_object = json.loads(decoded, object_hook=lambda d: SimpleNamespace(**d))
    assert content_object.version == Config.VERSION
    assert content_object.title == Config.TITLE
