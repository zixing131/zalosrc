package q00;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import me0.AbstractC23138m0;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q00.d */
/* loaded from: classes4.dex */
public class HandlerC24966d extends Handler {
    public HandlerC24966d(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    private void m129685a(Message message) {
        try {
            Message obtainMessage = obtainMessage(message.what, 1, 2);
            Bundle bundle = new Bundle();
            obtainMessage.setData(bundle);
            if (message.what == 10001) {
                bundle.putInt("com.zing.zalo.platform.result.ERROR_CODE", 0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("isUserLogged", AbstractC23138m0.m118770b());
                    jSONObject.put("hashCode", AbstractC23352g.m122788d("salt for hash data vYf96!p2:" + CoreUtility.f89233i));
                    bundle.putString("com.zing.zalo.platform.result.DATA", jSONObject.toString());
                } catch (JSONException e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            message.replyTo.send(obtainMessage);
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.arg2 == 1) {
            AbstractC20110a.m104535d("handleMessage: %d", Integer.valueOf(message.what));
            if (message.what != 10001) {
                super.handleMessage(message);
                return;
            }
            AbstractC20110a.m104535d("CMD_GET_LOGIN_STATUS data:", new Object[0]);
            message.getData();
            m129685a(message);
        }
    }
}
