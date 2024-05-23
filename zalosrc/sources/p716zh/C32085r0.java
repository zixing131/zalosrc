package p716zh;

import ag0.AbstractC0837p0;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.os.Build;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import is.AbstractC20826v0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p006a0.C0012a;
import p348mi.AbstractC23309i;

/* renamed from: zh.r0 */
/* loaded from: classes3.dex */
public class C32085r0 {

    /* renamed from: b */
    static volatile C32085r0 f147835b;

    /* renamed from: c */
    static Pattern f147836c = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;\\p{L}]*[-A-Za-z0-9+&@#/%=~_()|\\p{L}])", 42);

    /* renamed from: a */
    ClipboardManager.OnPrimaryClipChangedListener f147837a;

    private C32085r0() {
    }

    /* renamed from: c */
    public static C32085r0 m154802c() {
        if (f147835b == null) {
            synchronized (C32085r0.class) {
                try {
                    if (f147835b == null) {
                        f147835b = new C32085r0();
                    }
                } finally {
                }
            }
        }
        return f147835b;
    }

    /* renamed from: e */
    private void m154803e() {
        if (this.f147837a == null) {
            this.f147837a = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: zh.q0
                @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
                public final void onPrimaryClipChanged() {
                    C32085r0.this.m154805g();
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m154804f(boolean z11) {
        String str;
        String str2;
        ClipDescription description;
        try {
            if (!AbstractC20826v0.m108837u()) {
                return;
            }
            m154807h("handleClipBoardChanged");
            long currentTimeMillis = System.currentTimeMillis();
            ClipData m15b = new C0012a((ClipboardManager) MainApplication.getAppContext().getSystemService("clipboard"), new SensitiveData("clipboard_listener_change", "auto_scan")).m15b();
            String str3 = "";
            if (m15b == null) {
                str = "";
            } else {
                if (m15b.getItemCount() <= 0) {
                    str = "";
                } else {
                    str = m15b.getItemAt(0).getText().toString();
                }
                if (Build.VERSION.SDK_INT >= 26 && (description = m15b.getDescription()) != null) {
                    m154807h("have timestamp in clipboard");
                    currentTimeMillis = description.getTimestamp();
                }
            }
            if (!TextUtils.isEmpty(str)) {
                Matcher matcher = f147836c.matcher(str);
                if (!matcher.find()) {
                    str2 = "";
                } else {
                    str2 = matcher.group();
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (!z11) {
                        String m122345r5 = AbstractC23309i.m122345r5();
                        if (!TextUtils.isEmpty(m122345r5)) {
                            str3 = new JSONObject(m122345r5).optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                        }
                    }
                    m154807h("lastCopiedLink---" + str3);
                    m154807h("CurrentCopiedLink---" + str2);
                    if (!str2.equals(str3)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str2);
                        jSONObject.put("time", currentTimeMillis);
                        AbstractC23309i.m121280Op(jSONObject.toString());
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m154805g() {
        m154806d(true, true);
    }

    /* renamed from: d */
    public void m154806d(final boolean z11, boolean z12) {
        Runnable runnable = new Runnable() { // from class: zh.p0
            @Override // java.lang.Runnable
            public final void run() {
                C32085r0.this.m154804f(z11);
            }
        };
        if (z12) {
            AbstractC0837p0.m2225f().mo2040a(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: h */
    void m154807h(String str) {
    }

    /* renamed from: i */
    public void m154808i() {
        try {
            if (AbstractC20826v0.m108837u()) {
                m154803e();
                ClipboardManager clipboardManager = (ClipboardManager) MainApplication.getAppContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.addPrimaryClipChangedListener(this.f147837a);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public void m154809j() {
        ClipboardManager clipboardManager;
        try {
            if (this.f147837a != null && (clipboardManager = (ClipboardManager) MainApplication.getAppContext().getSystemService("clipboard")) != null) {
                clipboardManager.removePrimaryClipChangedListener(this.f147837a);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
