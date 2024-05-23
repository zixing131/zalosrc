package p645xh;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.AbstractC2151i0;
import androidx.work.C2148h;
import androidx.work.C2256x;
import androidx.work.EnumC2242k;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17526e;
import com.zing.zalocore.connection.socket.IPPort;
import ho0.AbstractC20110a;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23161o1;
import org.json.JSONException;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p248iy.C20882b;
import p609wh.AbstractC29039u0;
import p609wh.C29021l0;
import p681yh.C30981a;
import th.AbstractC26681b;

/* renamed from: xh.a */
/* loaded from: classes.dex */
public abstract class AbstractC29624a extends AbstractC17526e {
    public AbstractC29624a(int i11) {
        if (m147242x0()) {
            m93431w(i11);
        }
    }

    /* renamed from: x0 */
    private static boolean m147242x0() {
        return AbstractC26681b.f126363h;
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: D */
    public void mo93376D(IPPort iPPort, int i11, String str) {
        AbstractC20887g.m109228f(iPPort, i11, str);
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: E */
    public void mo93377E() {
        C20882b.Companion.m109144b().m109137h();
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: F */
    public void mo93378F(IPPort iPPort, int i11, String str, int i12, int i13) {
        AbstractC20887g.m109218E(iPPort, i11, str, i12, i13);
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: S */
    public String mo93391S(int i11, String str) {
        return AbstractC23161o1.m119318c(i11, str);
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: d0 */
    public void mo93402d0(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_code")) {
                int i11 = jSONObject.getInt("error_code");
                if (i11 == 0) {
                    C29021l0.m144916J().m144997L0(jSONObject);
                } else if (i11 == 102) {
                    mo93403e0();
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: e0 */
    public void mo93403e0() {
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: f0 */
    public void mo93404f0() {
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: g0 */
    public void mo93405g0() {
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: h0 */
    public void mo93406h0(int i11, String str) {
        if (i11 == 1) {
            C30981a.m150598f().m150609l();
            return;
        }
        if (i11 == 2) {
            if (TextUtils.isEmpty(str)) {
                C30981a.m150598f().m150602a();
                return;
            } else {
                C30981a.m150598f().m150603b(str);
                return;
            }
        }
        if (i11 == 3) {
            C30981a.m150598f().m150608k();
        } else {
            C30981a.m150598f().m150604c();
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: n */
    public String mo93417n() {
        return AbstractC29039u0.m145033a(AbstractC29039u0.b.FAIL_OVER_E2EE_URL);
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: o */
    public String mo93419o() {
        return AbstractC29039u0.m145033a(AbstractC29039u0.b.FAIL_OVER_URL);
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: v0 */
    public void mo93430v0(boolean z11, boolean z12, int i11, int i12, int i13, long j11, String str, long j12, long j13) {
        if (i12 == 2) {
            mo147243y0(j12, j11);
        }
        AbstractC20887g.m109221H(z11, z12, i11, i12, i13, j11, "", j12, j13);
        if (str.length() > 0 && i12 > 0) {
            AbstractC20887g.m109231i(CoreUtility.f89233i, i11, str, 0L, i12, CoreUtility.f89236l);
        }
    }

    /* renamed from: y0 */
    public void mo147243y0(long j11, long j12) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void m147244z0(Context context, String str, long j11, Class cls, String str2) {
        try {
            AbstractC2151i0.m11547h(context).m11554f(str2, EnumC2242k.REPLACE, (C2256x) ((C2256x.a) ((C2256x.a) ((C2256x.a) new C2256x.a(cls).m11862a(str2)).m11873n(new C2148h.a().m11539f("action", str).m11534a())).m11872m(j11, TimeUnit.MILLISECONDS)).m11863b());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
