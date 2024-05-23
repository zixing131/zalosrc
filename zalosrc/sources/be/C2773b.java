package be;

import ag0.C0849v0;
import com.zing.zalo.BuildConfig;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import hm0.C20096c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.ByteArrayOutputStream;
import jm0.InterfaceC21299i;
import me0.AbstractC23161o1;
import me0.AbstractC23193r0;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p609wh.C29037t0;

/* renamed from: be.b */
/* loaded from: classes3.dex */
public class C2773b extends AbstractC2772a {

    /* renamed from: s */
    private final boolean f10955s;

    public C2773b(byte[] bArr, int i11, int i12, long j11, int i13, String str, int i14, String str2, short s7, int i15, boolean z11) {
        super(bArr, i11, i12, j11, i13, str, i14, str2, s7, i15);
        this.f10955s = z11;
    }

    /* renamed from: f */
    private String m13335f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rate", AbstractC23309i.m122051jb());
            jSONObject.put("channels", AbstractC23309i.m121661Z());
            jSONObject.put("token", AbstractC23193r0.m119498g(false) + " android," + BuildConfig.VERSION_CODE);
            return jSONObject.toString();
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    @Override // be.AbstractC2772a
    /* renamed from: a */
    public void mo13330a() {
        int i11;
        try {
            if (this.f10950o > 3) {
                this.f10949n = 5;
                return;
            }
            this.f10949n = 1;
            try {
                RequestPacket requestPacket = new RequestPacket();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10939d));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(this.f10941f));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(this.f10937b));
                byteArrayOutputStream.write(AbstractC17522a.m93344g((int) this.f10940e));
                byteArrayOutputStream.write(AbstractC17522a.m93343f(this.f10945j).getBytes("UTF-8"));
                if (this.f10946k == 761) {
                    byte[] bytes = m13335f().getBytes("UTF-8");
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes.length));
                    byteArrayOutputStream.write(bytes);
                }
                byteArrayOutputStream.write(this.f10936a);
                requestPacket.m93301w((byte) 2);
                requestPacket.m93302x((byte) 0);
                requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
                requestPacket.m93297s(this.f10943h);
                requestPacket.m93299u(0L);
                requestPacket.m93274E((byte) 3);
                requestPacket.m93295q(this.f10946k);
                if (this.f10946k == 761) {
                    if (this.f10955s) {
                        i11 = 32;
                    } else {
                        i11 = 12;
                    }
                } else {
                    i11 = this.f10944i;
                }
                requestPacket.m93275F((byte) i11);
                requestPacket.m93303y(byteArrayOutputStream.toByteArray());
                int i12 = this.f10947l;
                if (i12 > 0) {
                    requestPacket.m93298t((byte) i12);
                } else {
                    requestPacket.m93298t((byte) 3);
                }
                requestPacket.m93276G(1);
                requestPacket.m93296r(m13332c());
                C29037t0 c29037t0 = new C29037t0(this.f10953r);
                c29037t0.f103775r = 4;
                c29037t0.m110313i0(requestPacket);
                if (AbstractC20626a.m107393i(MainApplication.getAppContext())) {
                    C0849v0.m2319b(c29037t0);
                    return;
                }
                InterfaceC21299i interfaceC21299i = this.f10953r;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1342c(new C20096c(50001, AbstractC23161o1.m119318c(50001, "")));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                InterfaceC21299i interfaceC21299i2 = this.f10953r;
                if (interfaceC21299i2 != null) {
                    interfaceC21299i2.mo1342c(new C20096c(50001, AbstractC23161o1.m119318c(50001, "")));
                }
            }
        } catch (Exception e12) {
            this.f10949n = 2;
            e12.printStackTrace();
        }
    }
}
