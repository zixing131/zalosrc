package rf0;

import am.C0943w;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.zviews.MiniAppBottomMenu;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import fn0.AbstractC19074t;
import gw.C19669z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oc0.C24221a;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p716zh.C31973j5;
import vg.C28203u6;

/* renamed from: rf0.d */
/* loaded from: classes5.dex */
public final class C25770d extends AbstractC1796t0 {

    /* renamed from: s */
    private final C1761c0 f122950s = new C1761c0();

    /* renamed from: t */
    private final C24221a f122951t = new C24221a();

    /* renamed from: u */
    private final List f122952u = new ArrayList();

    /* renamed from: v */
    private final C1761c0 f122953v = new C1761c0();

    /* renamed from: w */
    private final List f122954w = new ArrayList();

    /* renamed from: M */
    private final boolean m132901M(ContactProfile contactProfile) {
        Iterator it = this.f122952u.iterator();
        while (it.hasNext()) {
            if (AbstractC19074t.m100204b(((ContactProfile) it.next()).f42434r, contactProfile.f42434r)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    private final boolean m132902N(ContactProfile contactProfile) {
        int i11 = 0;
        if (this.f122952u.size() >= MiniAppBottomMenu.Companion.m81687b()) {
            return false;
        }
        this.f122952u.add(contactProfile);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", contactProfile.f42434r);
        jSONObject.put("name", contactProfile.f42437s);
        JSONArray jSONArray = new JSONArray();
        if (contactProfile.m40374K0()) {
            C31973j5 m40388T = contactProfile.m40388T(false);
            if (m40388T == null) {
                return true;
            }
            String str = contactProfile.f42446v;
            if (m40388T.m153786t0() && !TextUtils.isEmpty(str)) {
                jSONArray.put(str);
            } else {
                List m153762h = m40388T.m153762h();
                int size = m153762h.size();
                for (int i12 = 0; i12 < size && jSONArray.length() < 4; i12++) {
                    ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, (String) m153762h.get(i12), false, 2, null);
                    if (m141800i != null) {
                        String str2 = m141800i.f42446v;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONArray.put(str2);
                        }
                    }
                }
                i11 = m40388T.m153732O() - jSONArray.length();
            }
        } else {
            jSONArray.put(contactProfile.f42446v);
        }
        jSONObject.put("avatar_urls", jSONArray);
        jSONObject.put("n_more", i11);
        this.f122954w.add(jSONObject);
        return true;
    }

    /* renamed from: P */
    private final void m132903P() {
        this.f122952u.clear();
        List m103200Q = C19669z.Companion.m103232a().m103200Q();
        int size = m103200Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            ContactProfile m40996I = ((Conversation) m103200Q.get(i11)).m40996I();
            if (!m132904S(m40996I) && !m132902N(m40996I)) {
                return;
            }
        }
        if (this.f122952u.size() >= MiniAppBottomMenu.Companion.m81687b()) {
            return;
        }
        C18635e<ContactProfile> mo98465a = C18644n.m98531l().mo98465a(null, false);
        AbstractC19074t.m100207e(mo98465a, "getsortedZaloList(...)");
        for (ContactProfile contactProfile : mo98465a) {
            if (!m132904S(contactProfile) && m132901M(contactProfile) && !m132902N(contactProfile)) {
                return;
            }
        }
        if (this.f122952u.size() >= MiniAppBottomMenu.Companion.m81687b()) {
            return;
        }
        for (C31973j5 c31973j5 : C0943w.f3447a.m4475i()) {
            if (!TextUtils.isEmpty(c31973j5.m153781r())) {
                ContactProfile contactProfile2 = new ContactProfile("group_" + c31973j5.m153781r());
                contactProfile2.f42437s = c31973j5.m153793y();
                if (c31973j5.m153786t0()) {
                    contactProfile2.f42446v = c31973j5.m153756e();
                }
                if (ShareView.m87465QN(contactProfile2, this.f122951t) && m132901M(contactProfile2) && !m132902N(contactProfile2)) {
                    return;
                }
            }
        }
    }

    /* renamed from: S */
    private final boolean m132904S(ContactProfile contactProfile) {
        boolean z11 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
        if (!ShareView.m87465QN(contactProfile, this.f122951t)) {
            return true;
        }
        if ((!z11 && C21927m.m114302u().m114345m(contactProfile.f42434r)) || contactProfile.f42356L1) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final C1761c0 m132905O() {
        return this.f122950s;
    }

    /* renamed from: Q */
    public final C1761c0 m132906Q() {
        return this.f122953v;
    }

    /* renamed from: R */
    public final void m132907R() {
        this.f122951t.m126339N(true);
        this.f122951t.m126338M(true);
        m132903P();
        ContactProfile contactProfile = new ContactProfile();
        contactProfile.f42428p = 4;
        this.f122952u.add(contactProfile);
        this.f122950s.mo9221n(this.f122952u);
        this.f122953v.mo9221n(this.f122954w);
    }
}
