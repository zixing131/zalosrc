package x80;

import androidx.core.util.C1483e;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7961f;
import com.zing.zalo.p077ui.mycloud.collection.InterfaceC12558e;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import dj.C17945a0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kw.C21955a;
import kw.C21956b;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mg.C23288a;
import mw.EnumC23460e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p056cj.C3554v;
import p205hc.AbstractC19962a;
import p246iw.C20843c0;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import pk.C24799c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import q90.C25199b;
import q90.C25201d;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;

/* renamed from: x80.c0 */
/* loaded from: classes6.dex */
public final class C29480c0 extends AbstractC19962a implements InterfaceC12558e {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final List f136131A;

    /* renamed from: t */
    private final List f136132t;

    /* renamed from: u */
    private final InterfaceC24854k f136133u;

    /* renamed from: v */
    private final int f136134v;

    /* renamed from: w */
    private String f136135w;

    /* renamed from: x */
    private boolean f136136x;

    /* renamed from: y */
    private ArrayList f136137y;

    /* renamed from: z */
    private Map f136138z;

    /* renamed from: x80.c0$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: x80.c0$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f136139a;

        static {
            int[] iArr = new int[EnumC23460e.values().length];
            try {
                iArr[EnumC23460e.f113955q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23460e.f113956r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC23460e.f113957s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC23460e.f113958t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC23460e.f113959u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f136139a = iArr;
        }
    }

    /* renamed from: x80.c0$c */
    /* loaded from: classes6.dex */
    public static final class c implements C25201d.a {
        c() {
        }

        @Override // q90.C25201d.a
        /* renamed from: O1 */
        public boolean mo72544O1(SelectedItemData selectedItemData, boolean z11) {
            MessageId messageId;
            C17945a0 m72576a;
            boolean z12;
            List mo70742N1 = C29480c0.this.mo70742N1();
            List list = mo70742N1;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MessageId m95029V3 = ((SelectedItemData) it.next()).m72576a().m95029V3();
                    if (selectedItemData != null && (m72576a = selectedItemData.m72576a()) != null) {
                        messageId = m72576a.m95029V3();
                    } else {
                        messageId = null;
                    }
                    if (AbstractC19074t.m100204b(m95029V3, messageId)) {
                        break;
                    }
                }
            }
            if (mo70742N1.size() >= C29480c0.this.f136134v) {
                z12 = false;
                if (!z12 && z11) {
                    ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_share_my_cloud_max_msg_toast, Integer.valueOf(C29480c0.this.f136134v)));
                }
                return z12;
            }
            z12 = true;
            if (!z12) {
                ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_share_my_cloud_max_msg_toast, Integer.valueOf(C29480c0.this.f136134v)));
            }
            return z12;
        }

        @Override // q90.C25201d.a
        /* renamed from: Y0 */
        public boolean mo72545Y0() {
            return C29480c0.this.f136136x;
        }

        @Override // q90.C25201d.a
        /* renamed from: Z0 */
        public String mo72546Z0() {
            return C29480c0.this.f136135w;
        }

        @Override // q90.C25201d.a
        /* renamed from: a1 */
        public void mo72547a1(MyCloudMessageItem myCloudMessageItem, C16719g c16719g) {
            AbstractC19074t.m100208f(myCloudMessageItem, "item");
        }

        @Override // q90.C25201d.a
        /* renamed from: v */
        public List mo72548v() {
            return C29480c0.this.mo70742N1();
        }

        @Override // q90.C25201d.a
        /* renamed from: v1 */
        public void mo72549v1(SelectedItemData selectedItemData, boolean z11) {
            AbstractC19074t.m100208f(selectedItemData, "selectedItemData");
            C29480c0.this.m146719Xp(selectedItemData, z11);
        }
    }

    /* renamed from: x80.c0$d */
    /* loaded from: classes6.dex */
    public static final class d implements C25199b.a {
        d() {
        }

        @Override // q90.C25199b.a
        /* renamed from: a */
        public ArrayList mo130441a() {
            return C29480c0.this.m146718Tp();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x80.c0$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ SelectedItemData f136143r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SelectedItemData selectedItemData) {
            super(1);
            this.f136143r = selectedItemData;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(SelectedItemData selectedItemData) {
            boolean z11;
            AbstractC19074t.m100208f(selectedItemData, "it");
            C29480c0 c29480c0 = C29480c0.this;
            MessageId m95029V3 = selectedItemData.m72576a().m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            MessageId m95029V32 = this.f136143r.m72576a().m95029V3();
            AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
            if (c29480c0.m146711Pp(m95029V3, m95029V32) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: x80.c0$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f136144q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29480c0(InterfaceC29509z interfaceC29509z) {
        super(interfaceC29509z);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC29509z, "mvpView");
        this.f136132t = new ArrayList();
        m129210a = AbstractC24856m.m129210a(f.f136144q);
        this.f136133u = m129210a;
        this.f136134v = AbstractC23309i.m120819C8();
        this.f136135w = "";
        this.f136137y = new ArrayList();
        this.f136138z = new LinkedHashMap();
        this.f136131A = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pp */
    public final long m146711Pp(MessageId messageId, MessageId messageId2) {
        long m41045i;
        long m41045i2;
        if (messageId.m41053q() && messageId2.m41053q()) {
            m41045i = messageId.m41047k();
            m41045i2 = messageId2.m41047k();
        } else {
            m41045i = messageId.m41045i();
            m41045i2 = messageId2.m41045i();
        }
        return m41045i - m41045i2;
    }

    /* renamed from: Qp */
    private final void m146712Qp() {
        AbstractC18428c.m97658a(C23288a.f113033a, "204278670", 5, new Runnable() { // from class: x80.a0
            @Override // java.lang.Runnable
            public final void run() {
                C29480c0.m146713Rp(C29480c0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rp */
    public static final void m146713Rp(final C29480c0 c29480c0) {
        String str;
        AbstractC19074t.m100208f(c29480c0, "this$0");
        if (c29480c0.f136136x) {
            c29480c0.f136137y.clear();
            C1483e m119969D = AbstractC23262x6.m119969D(c29480c0.f136135w);
            C7961f m42658b = C7961f.Companion.m42658b();
            if (m119969D != null) {
                str = (String) m119969D.f6374a;
            } else {
                str = null;
            }
            c29480c0.f136137y.addAll(C7961f.m42620R(m42658b, str, "204278670", null, 0, 0, null, 48, null));
            if (m119969D != null) {
                Iterator it = c29480c0.f136137y.iterator();
                while (it.hasNext()) {
                    ((C3554v) it.next()).f15021j = (ArrayList) m119969D.f6375b;
                }
            }
            C21956b.m114657g("SMLMyCloudMessagePickerPresenter", "doSearch(" + c29480c0.f136135w + "): DONE. Result size: " + c29480c0.f136137y.size());
        } else {
            c29480c0.f136137y.clear();
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: x80.b0
            @Override // java.lang.Runnable
            public final void run() {
                C29480c0.m146714Sp(C29480c0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sp */
    public static final void m146714Sp(C29480c0 c29480c0) {
        AbstractC19074t.m100208f(c29480c0, "this$0");
        ((InterfaceC29509z) c29480c0.m103742Dp()).mo70700m0(c29480c0.f136135w);
        C21956b.m114657g("SMLMyCloudMessagePickerPresenter", "doSearch(" + c29480c0.f136135w + "): NOTIFY RESULT. Result size: " + c29480c0.f136137y.size());
    }

    /* renamed from: Wp */
    private final Map m146715Wp() {
        return (Map) this.f136133u.getValue();
    }

    /* renamed from: Yp */
    private final void m146716Yp() {
        String m118743r0;
        this.f136138z.clear();
        for (EnumC23460e enumC23460e : mo70744a0()) {
            Map map = this.f136138z;
            String m123172c = enumC23460e.m123172c();
            int i11 = b.f136139a[enumC23460e.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_link_lowercase);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_document);
                        }
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_photo_lowercase);
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_tab_message);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_all_lowercase);
            }
            AbstractC19074t.m100205c(m118743r0);
            map.put(m123172c, m118743r0);
        }
    }

    /* renamed from: Zp */
    private final void m146717Zp(String str, boolean z11) {
        int i11;
        int i12;
        Integer num = (Integer) m146715Wp().get(str);
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        if (z11) {
            i12 = i11 + 1;
        } else {
            i12 = i11 - 1;
        }
        m146715Wp().put(str, Integer.valueOf(i12));
    }

    @Override // com.zing.zalo.p077ui.mycloud.collection.InterfaceC12558e
    /* renamed from: Fj */
    public void mo70741Fj(long j11, String str) {
        int m131511r;
        AbstractC19074t.m100208f(str, "entryPoint");
        List list = this.f136132t;
        m131511r = AbstractC25370t.m131511r(list, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SelectedItemData) it.next()).m72576a().m95029V3());
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = this.f136132t.iterator();
        while (it2.hasNext()) {
            String valueOf = String.valueOf(AbstractC19646n0.m102878B(((SelectedItemData) it2.next()).m72576a().m95041W4(), false));
            if (hashMap.containsKey(valueOf)) {
                Object obj = hashMap.get(valueOf);
                AbstractC19074t.m100205c(obj);
                hashMap.put(valueOf, Integer.valueOf(((Number) obj).intValue() + 1));
            } else {
                hashMap.put(valueOf, 1);
            }
        }
        C24799c m109091x0 = AbstractC23306f.m120602N0().m109091x0(j11);
        if (m109091x0 != null) {
            String m114637d = C21955a.f108070a.m114637d(str, hashMap, m109091x0.m128832l());
            C20843c0 m120602N0 = AbstractC23306f.m120602N0();
            AbstractC19074t.m100207e(m120602N0, "provideMyCloudCollectionManager(...)");
            C20843c0.m108969V(m120602N0, m109091x0.m128824d(), arrayList, (byte) 0, m109091x0.m128825e(), false, m114637d, false, 64, null);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.collection.InterfaceC12558e
    /* renamed from: N1 */
    public List mo70742N1() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f136132t);
        return arrayList;
    }

    /* renamed from: Tp */
    public final ArrayList m146718Tp() {
        return this.f136137y;
    }

    @Override // com.zing.zalo.p077ui.mycloud.collection.InterfaceC12558e
    /* renamed from: Wm */
    public C25199b.a mo70743Wm() {
        return new d();
    }

    /* renamed from: Xp */
    public final void m146719Xp(SelectedItemData selectedItemData, boolean z11) {
        boolean m131542D;
        AbstractC19074t.m100208f(selectedItemData, "selectedItemData");
        if (!z11) {
            m131542D = AbstractC25378x.m131542D(this.f136132t, new e(selectedItemData));
            if (m131542D) {
                ((InterfaceC29509z) m103742Dp()).mo70699I4(this.f136132t.size(), selectedItemData.m72577b(), false);
                m146717Zp(selectedItemData.m72577b(), false);
                return;
            }
            return;
        }
        List list = this.f136132t;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MessageId m95029V3 = ((SelectedItemData) it.next()).m72576a().m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                MessageId m95029V32 = selectedItemData.m72576a().m95029V3();
                AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
                if (m146711Pp(m95029V3, m95029V32) == 0) {
                    return;
                }
            }
        }
        this.f136132t.add(selectedItemData);
        ((InterfaceC29509z) m103742Dp()).mo70699I4(this.f136132t.size(), selectedItemData.m72577b(), true);
        m146717Zp(selectedItemData.m72577b(), true);
    }

    @Override // com.zing.zalo.p077ui.mycloud.collection.InterfaceC12558e
    /* renamed from: a0 */
    public List mo70744a0() {
        if (this.f136131A.isEmpty()) {
            this.f136131A.add(EnumC23460e.f113955q);
            this.f136131A.add(EnumC23460e.f113956r);
            this.f136131A.add(EnumC23460e.f113957s);
            this.f136131A.add(EnumC23460e.f113958t);
            this.f136131A.add(EnumC23460e.f113959u);
        }
        return this.f136131A;
    }

    @Override // com.zing.zalo.p077ui.mycloud.collection.InterfaceC12558e
    /* renamed from: cn */
    public Map mo70745cn() {
        if (this.f136138z.isEmpty()) {
            m146716Yp();
        }
        return this.f136138z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:            if ((!r2) != false) goto L8;     */
    @Override // com.zing.zalo.p077ui.mycloud.collection.InterfaceC12558e
    /* renamed from: da */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo70746da(CharSequence charSequence, boolean z11) {
        CharSequence m127168X0;
        boolean z12;
        boolean m127128x;
        AbstractC19074t.m100208f(charSequence, "key");
        m127168X0 = AbstractC24342w.m127168X0(charSequence);
        String obj = m127168X0.toString();
        this.f136135w = obj;
        if (obj.length() > 0) {
            m127128x = AbstractC24341v.m127128x(this.f136135w);
            z12 = true;
        }
        z12 = false;
        this.f136136x = z12;
        if (z11) {
            m146712Qp();
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.collection.InterfaceC12558e
    /* renamed from: e1 */
    public C25201d.a mo70747e1() {
        return new c();
    }
}
