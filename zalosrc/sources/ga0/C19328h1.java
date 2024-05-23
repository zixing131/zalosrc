package ga0;

import am.C0943w;
import android.text.SpannableString;
import au.EnumC2382z;
import ci.C3526u;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.MediaStoreItem;
import dj.C17945a0;
import dm.C18027a;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23160o0;
import me0.AbstractC23262x6;
import me0.C23250w4;
import on0.AbstractC24342w;
import p142ey.C18644n;
import p300kk.C21753c;
import p304ks.C21927m;
import p461qu.AbstractC25495a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29072d;
import p612wk.AbstractC29075g;
import p612wk.AbstractC29076h;
import p612wk.C29071c;
import p716zh.C31973j5;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;
import vg.C28203u6;

/* renamed from: ga0.h1 */
/* loaded from: classes6.dex */
public final class C19328h1 extends AbstractC19358r1 {

    /* renamed from: t */
    private final HashMap f96042t;

    /* renamed from: u */
    private final C29071c f96043u;

    /* renamed from: ga0.h1$a */
    /* loaded from: classes6.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((MediaStoreItem) obj2).m40599m().m95313z4()), Long.valueOf(((MediaStoreItem) obj).m40599m().m95313z4()));
            return m135478b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19328h1(InterfaceC18319c interfaceC18319c, String str, HashMap hashMap, C29071c c29071c) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(hashMap, "uidExistThreadChatMap");
        AbstractC19074t.m100208f(c29071c, "paginationData");
        this.f96042t = hashMap;
        this.f96043u = c29071c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013c, code lost:            if ((r0 ^ r4) == false) goto L205;     */
    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Object obj;
        C19325g1 c19325g1;
        String str;
        String str2;
        String str3;
        CharSequence m127168X0;
        ContactProfile m98552o;
        String str4;
        SpannableString spannableString;
        int i11;
        boolean z11;
        C18316b c18316b;
        if (isCancelled()) {
            return;
        }
        InterfaceC18319c m101438e = m101438e();
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C19325g1) {
            c19325g1 = (C19325g1) obj;
        } else {
            c19325g1 = null;
        }
        if (c19325g1 == null) {
            return;
        }
        this.f96043u.m145238b();
        if (this.f96043u.m145238b() != 0) {
            mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_ADD_DATA", AbstractC29075g.m145256c(AbstractC29076h.m.f134827b, m101455l(), new ArrayList(), AbstractC29072d.c.f134805a, this.f96043u), null, null, 12, null));
        }
        boolean m101196V = c19325g1.m101196V();
        ArrayList arrayList = new ArrayList();
        try {
            if (isCancelled()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(m101455l());
            int i12 = 0;
            Pattern compile = Pattern.compile(C3526u.Companion.m17866b((String[]) arrayList2.toArray(new String[0])), 2);
            if (isCancelled()) {
                return;
            }
            C21753c m95860n = C18027a.Companion.m95862a().m95860n(m101455l(), null, null, EnumC2382z.f9946s, this.f96043u.m145238b(), 125, this);
            C29071c m101098g = C19318e0.Companion.m101098g(this.f96043u, m95860n.m112206b(), 100, 25);
            if (isCancelled()) {
                return;
            }
            List m112206b = m95860n.m112206b();
            boolean z12 = true;
            if (m112206b.size() > 1) {
                AbstractC25376w.m131534w(m112206b, new a());
            }
            for (MediaStoreItem mediaStoreItem : m95860n.m112206b()) {
                if (isCancelled()) {
                    return;
                }
                mediaStoreItem.m40615x0(EnumC2382z.f9946s, compile, 7);
                try {
                    CharSequence m40578V = mediaStoreItem.m40578V();
                    if (m40578V instanceof SpannableString) {
                        spannableString = (SpannableString) m40578V;
                    } else {
                        spannableString = null;
                    }
                    if (spannableString != null) {
                        CharSequence m40578V2 = mediaStoreItem.m40578V();
                        if (m40578V2 != null) {
                            i11 = m40578V2.length();
                        } else {
                            i11 = 0;
                        }
                        Object[] spans = spannableString.getSpans(i12, i11, Object.class);
                        if (spans != null && spans.length == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    String m120002o = AbstractC23262x6.m120002o(mediaStoreItem.m40599m().m95090b5());
                    AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                    Matcher matcher = compile.matcher(m120002o);
                    AbstractC19074t.m100207e(matcher, "matcher(...)");
                    matcher.find();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                String mo95039W2 = mediaStoreItem.m40599m().mo95039W2();
                if (mo95039W2 != null && mo95039W2.length() != 0) {
                    String m119251g = AbstractC23160o0.m119251g(mediaStoreItem.m40599m().m95313z4());
                    if (AbstractC25495a.m132079d(mediaStoreItem.m40599m().mo95039W2())) {
                        C31973j5 m4472f = C0943w.f3447a.m4472f(AbstractC25495a.m132088m(mediaStoreItem.m40599m().mo95039W2()));
                        if (m4472f != null && m4472f.m153781r().length() > 0) {
                            if (!C21927m.m114302u().m114345m("group_" + m4472f.m153781r())) {
                                String m94862C4 = mediaStoreItem.m40599m().m94862C4();
                                if (m94862C4 == null) {
                                    m94862C4 = "";
                                } else {
                                    AbstractC19074t.m100205c(m94862C4);
                                }
                                String m119788L = C23250w4.m119788L(m94862C4, mediaStoreItem.m40599m().m94854B4());
                                C17945a0 m40599m = mediaStoreItem.m40599m();
                                if (m119788L.length() == 0) {
                                    str4 = m4472f.m153793y();
                                } else {
                                    str4 = m119788L + " • " + m4472f.m153793y();
                                }
                                m40599m.m95164ib(str4);
                                AbstractC19074t.m100205c(m119251g);
                                arrayList.add(new AbstractC29069a.j(16384, mediaStoreItem, m119251g));
                            }
                        }
                    } else if (this.f96042t.containsKey(mediaStoreItem.m40599m().mo95039W2())) {
                        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, mediaStoreItem.m40599m().mo95039W2(), null, 2, null);
                        if (m141798e != null) {
                            String str5 = m141798e.f42434r;
                            AbstractC19074t.m100207e(str5, "uid");
                            if (str5.length() != 0 && !C21927m.m114302u().m114345m(m141798e.f42434r) && ((m141798e.f42352K0 <= 0 || C21927m.m114302u().m114318P(m141798e.f42434r)) && (!m101196V || (m98552o = C18644n.m98531l().m98552o(m141798e.f42434r)) == null || m98552o.f42382U0 != 0))) {
                                String m40383Q = m141798e.m40383Q(true, false);
                                if (m40383Q != null) {
                                    AbstractC19074t.m100205c(m40383Q);
                                    m127168X0 = AbstractC24342w.m127168X0(m40383Q);
                                    String obj2 = m127168X0.toString();
                                    if (obj2 != null) {
                                        str3 = obj2;
                                        m141798e.f42437s = str3;
                                        mediaStoreItem.m40599m().m95164ib(m141798e.f42437s);
                                        AbstractC19074t.m100205c(m119251g);
                                        arrayList.add(new AbstractC29069a.j(16384, mediaStoreItem, m119251g));
                                        z12 = true;
                                        i12 = 0;
                                    }
                                }
                                str3 = m141798e.f42437s;
                                m141798e.f42437s = str3;
                                mediaStoreItem.m40599m().m95164ib(m141798e.f42437s);
                                AbstractC19074t.m100205c(m119251g);
                                arrayList.add(new AbstractC29069a.j(16384, mediaStoreItem, m119251g));
                                z12 = true;
                                i12 = 0;
                            }
                        }
                        z12 = true;
                        i12 = 0;
                    }
                }
                z12 = true;
                i12 = 0;
            }
            if (isCancelled()) {
                return;
            }
            if (this.f96043u.m145238b() <= 0) {
                str2 = "ACTION_SEARCH_TASK_RESULT_SET_DATA";
            } else {
                str2 = "ACTION_SEARCH_TASK_RESULT_ADD_DATA";
            }
            mo205i9(new C18316b(str2, AbstractC29075g.m145256c(AbstractC29076h.m.f134827b, m101455l(), arrayList, AbstractC29072d.d.f134806a, m101098g), null, null, 12, null));
        } catch (Exception e12) {
            e12.printStackTrace();
            if (isCancelled()) {
                return;
            }
            if (this.f96043u.m145238b() <= 0) {
                str = "ACTION_SEARCH_TASK_RESULT_SET_DATA";
            } else {
                str = "ACTION_SEARCH_TASK_RESULT_ADD_DATA";
            }
            mo205i9(new C18316b(str, AbstractC29075g.m145256c(AbstractC29076h.m.f134827b, m101455l(), new ArrayList(), AbstractC29072d.a.f134803a, this.f96043u), null, null, 12, null));
        }
    }

    public /* synthetic */ C19328h1(InterfaceC18319c interfaceC18319c, String str, HashMap hashMap, C29071c c29071c, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18319c, str, hashMap, (i11 & 8) != 0 ? new C29071c(0, true) : c29071c);
    }
}
