package th0;

import android.content.Context;
import com.zing.zalo.zbrowser.cache.C16898b;
import com.zing.zalo.zbrowser.cache.C16899c;
import com.zing.zalo.zbrowser.cache.C16900d;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import th0.AbstractC26698d;
import th0.C26699e;
import vh0.AbstractC28254a;

/* renamed from: th0.c */
/* loaded from: classes7.dex */
public class C26697c extends AbstractC26698d {

    /* renamed from: A */
    private C16900d f126498A;

    /* renamed from: B */
    private C16899c f126499B;

    public C26697c(C16898b c16898b, String str, C26699e.g gVar, Context context) {
        super(c16898b, str, context);
        this.f126498A = null;
        this.f126499B = null;
        m137209J(gVar);
        int i11 = c16898b.f86069u;
        if (i11 > 0) {
            this.f126498A = new C16900d(i11, null);
        }
    }

    /* renamed from: M */
    public static void m137178M(Context context) {
        try {
            C16899c.g.m90429b(m137179N(context));
        } catch (Exception unused) {
        }
    }

    /* renamed from: N */
    public static File m137179N(Context context) {
        return new File(context.getCacheDir(), "zbrowserjump");
    }

    /* renamed from: L */
    public void m137180L(Context context) {
        try {
            C16900d c16900d = this.f126498A;
            if (c16900d != null) {
                c16900d.m149138c();
                this.f126498A = null;
            }
            C16899c c16899c = this.f126499B;
            if (c16899c != null) {
                c16899c.m90400v();
                this.f126499B = null;
            }
            m137178M(context);
        } catch (Exception unused) {
        }
    }

    /* renamed from: O */
    public JSONObject m137181O(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray optJSONArray = jSONObject.optJSONArray("actions");
            if (optJSONArray != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i11);
                    if (jSONObject3 != null) {
                        int optInt = jSONObject3.optInt("actionType", -1);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("actionType", optInt);
                        if (optInt != 1) {
                            if (optInt != 2) {
                                if (optInt != 3) {
                                    jSONObject4.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, -1);
                                } else {
                                    boolean m137211m = m137211m(jSONObject3.optString("data", ""));
                                    jSONObject4.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, 0);
                                    jSONObject4.put("data", m137211m);
                                }
                            } else {
                                m137206G(jSONObject3.optString("data", ""));
                                jSONObject4.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, 0);
                            }
                        } else {
                            jSONObject4.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, 0);
                            jSONObject4.put("data", m137216v().m137231c());
                        }
                        jSONArray.put(jSONObject4);
                    }
                }
                jSONObject2.put("data", jSONArray);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: P */
    public void m137182P(List list, AbstractC26698d.e eVar, AbstractC26695a abstractC26695a, Context context) {
        if (list != null && list.size() > 0) {
            if (this.f126517q.f86058j && !AbstractC28254a.m142264c(context)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    eVar.mo137225a((String) it.next());
                }
                AbstractC26698d.f fVar = this.f126520t;
                if (fVar != null) {
                    fVar.mo137228a(String.format("PRELOAD - IGNORE (not use wifi)", new Object[0]));
                    return;
                }
                return;
            }
            new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (m137214s().m90369h(str)) {
                    super.m137219y(str, eVar, abstractC26695a, context);
                } else {
                    AbstractC26698d.f fVar2 = this.f126520t;
                    if (fVar2 != null) {
                        fVar2.mo137228a(String.format("No need to preload: %s", str));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public void m137183Q(JSONObject jSONObject, Context context) {
        try {
            C26699e.g gVar = this.f126521u;
            if (gVar != null) {
                gVar.mo137260a(jSONObject.toString());
            }
            m137207H(C16898b.m90364d(jSONObject), context);
        } catch (Exception unused) {
        }
    }
}
