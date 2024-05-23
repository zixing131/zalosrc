package f20;

import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.p072ui.view.BlockListChannelView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import f20.InterfaceC18703a;
import fn0.AbstractC19074t;
import java.util.List;
import pm0.AbstractC24866w;
import pm0.C24860q;
import qm0.AbstractC25366r;
import s20.AbstractC26112n;
import v00.AbstractC27413h;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: f20.b */
/* loaded from: classes5.dex */
public final class C18704b extends AbstractC17505t0 implements InterfaceC18703a {

    /* renamed from: w */
    private final ViewPager f93958w;

    /* renamed from: x */
    private final List f93959x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: f20.b$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: q */
        public static final a f93960q = new a("CHANNEL", 0, 0);

        /* renamed from: r */
        private static final /* synthetic */ a[] f93961r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f93962s;

        /* renamed from: p */
        private final int f93963p;

        static {
            a[] m98630b = m98630b();
            f93961r = m98630b;
            f93962s = AbstractC30166b.m148796a(m98630b);
        }

        private a(String str, int i11, int i12) {
            this.f93963p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m98630b() {
            return new a[]{f93960q};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f93961r.clone();
        }

        /* renamed from: c */
        public final int m98631c() {
            return this.f93963p;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18704b(ViewPager viewPager, C17487o0 c17487o0) {
        super(c17487o0);
        List m131496e;
        AbstractC19074t.m100208f(viewPager, "viewPager");
        AbstractC19074t.m100208f(c17487o0, "zvm");
        this.f93958w = viewPager;
        m131496e = AbstractC25366r.m131496e(AbstractC24866w.m129235a(Integer.valueOf(a.f93960q.m98631c()), AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_block_list_page_channel, new Object[0])));
        this.f93959x = m131496e;
    }

    @Override // f20.InterfaceC18703a
    /* renamed from: a */
    public void mo98626a(int i11) {
        InterfaceC18703a.a.m98628a(this, i11);
    }

    @Override // f20.InterfaceC18703a
    /* renamed from: c */
    public void mo98627c(int i11) {
        InterfaceC18703a.a.m98629b(this, i11);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f93959x.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: i */
    public CharSequence mo35337i(int i11) {
        String str = (String) ((C24860q) this.f93959x.get(i11)).m129216d();
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        if (((Number) ((C24860q) this.f93959x.get(i11)).m129215c()).intValue() == a.f93960q.m98631c()) {
            return new BlockListChannelView();
        }
        throw new IllegalArgumentException();
    }
}
