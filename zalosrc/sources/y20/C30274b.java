package y20;

import ag0.AbstractC0857z0;
import com.google.android.gms.auth.AbstractC4019a;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: y20.b */
/* loaded from: classes5.dex */
public class C30274b extends AbstractC0857z0 {

    /* renamed from: f */
    private InterfaceC30273a f140646f;

    /* renamed from: g */
    protected String f140647g;

    /* renamed from: h */
    protected String f140648h;

    public C30274b(String str, String str2) {
        this.f140647g = str2;
        this.f140648h = str;
    }

    /* renamed from: u */
    private void m149405u() {
        String m149408v = m149408v();
        if (m149408v == null) {
            return;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://www.googleapis.com/oauth2/v1/userinfo?access_token=" + m149408v).openConnection()));
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            JSONObject jSONObject = new JSONObject(m149406x(inputStream));
            inputStream.close();
            InterfaceC30273a interfaceC30273a = this.f140646f;
            if (interfaceC30273a != null) {
                interfaceC30273a.mo78015b(jSONObject);
                return;
            }
            return;
        }
        if (responseCode == 401) {
            AbstractC4019a.m19030f(MainApplication.getAppContext(), m149408v);
            m149409w("Server auth error, please try again.", null);
        } else {
            m149409w("Server returned the following error code: " + responseCode, null);
        }
    }

    /* renamed from: x */
    private String m149406x(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[ZVideoUtilMetadata.FF_PROFILE_H264_INTRA];
        while (true) {
            int read = inputStream.read(bArr, 0, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag0.AbstractC0857z0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Void mo2432g(Void... voidArr) {
        try {
            m149405u();
            return null;
        } catch (IOException e11) {
            m149409w("Following Error occured, please try again. " + e11.getMessage(), e11);
            return null;
        } catch (JSONException e12) {
            m149409w("Bad response: " + e12.getMessage(), e12);
            return null;
        }
    }

    /* renamed from: v */
    protected String m149408v() {
        try {
            return AbstractC4019a.m19029e(MainApplication.getAppContext(), this.f140648h, this.f140647g);
        } catch (UserRecoverableAuthException e11) {
            InterfaceC30273a interfaceC30273a = this.f140646f;
            if (interfaceC30273a != null) {
                interfaceC30273a.mo78014a(e11);
                return null;
            }
            return null;
        } catch (GoogleAuthException e12) {
            m149409w("Unrecoverable error " + e12.getMessage(), e12);
            return null;
        } catch (Exception e13) {
            m149409w(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, e13);
            return null;
        }
    }

    /* renamed from: w */
    protected void m149409w(String str, Exception exc) {
        if (exc != null) {
            AbstractC23350e.m122775e("TokenInfoTask", "Exception: ", exc);
        }
        InterfaceC30273a interfaceC30273a = this.f140646f;
        if (interfaceC30273a != null) {
            interfaceC30273a.mo78014a(str);
        }
    }

    /* renamed from: y */
    public void m149410y(InterfaceC30273a interfaceC30273a) {
        this.f140646f = interfaceC30273a;
    }
}
