package fd0;

import ag0.C0815e1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uicontrol.PushToTalkSpeechToText;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import on0.C24329j;
import org.json.JSONObject;
import p361nb.C23648e;
import p542ub.InterfaceC27218a;
import qm0.AbstractC25368s;
import ui0.C27280g;

/* renamed from: fd0.d */
/* loaded from: classes4.dex */
public abstract class AbstractC18884d {

    /* renamed from: a */
    private static long f94264a;

    /* renamed from: fd0.d$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94265a;

        static {
            int[] iArr = new int[EnumC18886f.values().length];
            try {
                iArr[EnumC18886f.f94270p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18886f.f94271q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18886f.f94275u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC18886f.f94274t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC18886f.f94272r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC18886f.f94273s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC18886f.f94276v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f94265a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:            if (r14.m99023e() <= 0) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:            r0.put("isplayed", 1);        r0.put("playedduration", (int) ((r14.m99023e() / 100) * r14.m99021c()));        r0.put("percentplay", r14.m99023e());     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:            if (r14.m99029k() == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:            if (fn0.AbstractC19074t.m100204b(r13, "csc_voice_cancel") == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:            r0.put("delete_source", r14.m99020b().m99001c());        r13 = r14.m99026h();     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:            if (r13 != null) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:            r9 = r13;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:            r0.put("len", r9.length());        r13 = on0.AbstractC24342w.m127168X0(r9);        r13 = r13.toString();     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:            if (r13.length() <= 0) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:            r7 = r13;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:            if (r7 == null) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:            r13 = new on0.C24329j("\\s+").m127021i(r7, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:            if (r13 != null) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:            r0.put("word_count", r13.size());        r0.put("asr", java.lang.String.valueOf(r14.m99019a()));     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:            r13 = qm0.AbstractC25368s.m131502j();     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:            r0.put("isplayed", 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:            if (r13.equals("csc_voice_send") == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:            if (r13.equals("csc_voice_play_preview") == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0161, code lost:            r0.put("source", r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015e, code lost:            if (r13.equals("csc_voice_preview") == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:            if (r13.equals("csc_voice_cancel") == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:            r0.put("source", r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:            if (r14.m99025g() == false) goto L19;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final JSONObject m99004a(String str, C18888h c18888h) {
        CharSequence m127168X0;
        List m131502j;
        JSONObject jSONObject = new JSONObject();
        if (c18888h.m99021c() > 0) {
            jSONObject.put("duration_record", c18888h.m99021c());
        }
        jSONObject.put("speech_to_text", c18888h.m99029k() ? 1 : 0);
        int i11 = 1;
        int i12 = !c18888h.m99024f() ? 1 : 0;
        String str2 = null;
        String str3 = "";
        switch (str.hashCode()) {
            case -526940049:
                break;
            case 1221039109:
                if (str.equals("csc_voice_s2t_stop")) {
                    int i13 = a.f94265a[c18888h.m99027i().ordinal()];
                    if (i13 != 1) {
                        i11 = 2;
                        if (i13 != 2) {
                            i11 = 3;
                            if (i13 != 3) {
                                i11 = 4;
                                if (i13 == 4) {
                                    i11 = 0;
                                }
                            }
                        }
                    }
                    jSONObject.put("source", i12);
                    jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
                    String m99026h = c18888h.m99026h();
                    if (m99026h != null) {
                        str3 = m99026h;
                    }
                    jSONObject.put("len", str3.length());
                    m127168X0 = AbstractC24342w.m127168X0(str3);
                    String obj = m127168X0.toString();
                    if (obj.length() > 0) {
                        str2 = obj;
                    }
                    if (str2 == null || (m131502j = new C24329j("\\s+").m127021i(str2, 0)) == null) {
                        m131502j = AbstractC25368s.m131502j();
                    }
                    jSONObject.put("word_count", m131502j.size());
                    jSONObject.put("asr", String.valueOf(c18888h.m99019a()));
                    break;
                }
                break;
            case 1491717494:
                break;
            case 1575404609:
                break;
            case 1673582835:
                break;
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static final C18888h m99005b(PushToTalkSpeechToText pushToTalkSpeechToText) {
        AbstractC19074t.m100208f(pushToTalkSpeechToText, "<this>");
        return new C18888h(pushToTalkSpeechToText.getEntrypoint$app_release(), pushToTalkSpeechToText.getTrackingLogChatType(), pushToTalkSpeechToText.getDuration$app_release(), pushToTalkSpeechToText.m87983c0(), pushToTalkSpeechToText.getSessionLongHoldLog$app_release(), pushToTalkSpeechToText.getSessionPreviewLog$app_release(), pushToTalkSpeechToText.getPreviewedProgressLog$app_release(), pushToTalkSpeechToText.getStopS2TEntryPoint$app_release(), pushToTalkSpeechToText.getSpeechToText$app_release(), null, null, 1536, null);
    }

    /* renamed from: c */
    public static final int m99006c(EnumC18886f enumC18886f, int i11) {
        AbstractC19074t.m100208f(enumC18886f, "<this>");
        switch (a.f94265a[enumC18886f.ordinal()]) {
            case 1:
                return 1;
            case 2:
            case 3:
                return 7;
            case 4:
                return i11;
            case 5:
            case 6:
            case 7:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public static final void m99007d(String str, String str2) {
        AbstractC19074t.m100208f(str, "logChatType");
        AbstractC19074t.m100208f(str2, "entrypoint");
        try {
            if (SystemClock.elapsedRealtime() - f94264a > 3000) {
                return;
            }
            C0815e1.m2075D().m2100V(new C23648e(16, str2, 0, "csc_voice_s2t_keeprecord", str), false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(PushToTalkSpeechToText.Companion.m87984a(), e11);
        }
    }

    /* renamed from: e */
    public static final void m99008e(String str) {
        AbstractC19074t.m100208f(str, "logChatType");
        try {
            f94264a = SystemClock.elapsedRealtime();
            C0815e1.m2075D().m2100V(new C23648e(16, "csc_chatbar", 0, "csc_voice_s2t_reopen_board", str), false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(PushToTalkSpeechToText.Companion.m87984a(), e11);
        }
    }

    /* renamed from: f */
    public static final void m99009f() {
        f94264a = 0L;
    }

    /* renamed from: g */
    public static final boolean m99010g(EnumC18886f enumC18886f) {
        AbstractC19074t.m100208f(enumC18886f, "<this>");
        switch (a.f94265a[enumC18886f.ordinal()]) {
            case 1:
            case 4:
            case 5:
            case 7:
                return true;
            case 2:
            case 3:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: h */
    public static final boolean m99011h(EnumC18886f enumC18886f) {
        AbstractC19074t.m100208f(enumC18886f, "<this>");
        switch (a.f94265a[enumC18886f.ordinal()]) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            case 2:
            case 3:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: i */
    public static final void m99012i(int i11, InterfaceC27218a interfaceC27218a, View view, View view2) {
        String m118743r0;
        AbstractC19074t.m100208f(interfaceC27218a, "zaloActivity");
        AbstractC19074t.m100208f(view, "container");
        try {
            String str = "";
            int m118742r = AbstractC23136l9.m118742r(12.0f);
            Drawable drawable = null;
            if (i11 != -102 && i11 != -101) {
                if (i11 != -1) {
                    switch (i11) {
                    }
                }
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_detect_voice_to_text_error);
                AbstractC19074t.m100207e(str, "getString(...)");
                Context context = interfaceC27218a.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                drawable = C27280g.m139659b(context, AbstractC23322a.zds_ic_warning_solid_24, AbstractC2808b.f150839y60);
            } else {
                if (i11 == -102) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unable_detect_voice_to_text);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_connection_covert_voice_to_text);
                }
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                str = m118743r0;
            }
            if (!interfaceC27218a.isFinishing()) {
                Snackbar m90669d = Snackbar.Companion.m90669d(view, str, -1);
                m90669d.m90644J(drawable);
                m90669d.m90639E(view2);
                m90669d.m90645K(m118742r);
                m90669d.m90648N();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j */
    public static final void m99013j(PushToTalkSpeechToText pushToTalkSpeechToText, String str, C18888h c18888h) {
        AbstractC19074t.m100208f(pushToTalkSpeechToText, "<this>");
        AbstractC19074t.m100208f(str, "actionId");
        if (c18888h == null) {
            try {
                c18888h = m99005b(pushToTalkSpeechToText);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(PushToTalkSpeechToText.Companion.m87984a(), e11);
                return;
            }
        }
        m99014k(str, c18888h);
    }

    /* renamed from: k */
    public static final void m99014k(String str, C18888h c18888h) {
        AbstractC19074t.m100208f(str, "actionId");
        AbstractC19074t.m100208f(c18888h, "logParams");
        try {
            String jSONObject = m99004a(str, c18888h).toString();
            AbstractC19074t.m100207e(jSONObject, "toString(...)");
            C0815e1.m2075D().m2100V(new C23648e(16, c18888h.m99022d(), 0, str, c18888h.m99028j(), jSONObject), false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(PushToTalkSpeechToText.Companion.m87984a(), e11);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m99015l(PushToTalkSpeechToText pushToTalkSpeechToText, String str, C18888h c18888h, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c18888h = null;
        }
        m99013j(pushToTalkSpeechToText, str, c18888h);
    }
}
