package p608wg;

import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.zviews.a81;
import fn0.AbstractC19074t;
import me0.C23255x;
import p018ah.C0859b;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import p644xg.C29622a;
import p680yg.C30963b;
import p680yg.C30965d;
import p680yg.C30967f;
import p680yg.C30969h;
import p680yg.C30971j;
import p680yg.C30973l;
import p680yg.C30975n;
import p680yg.C30977p;
import p680yg.C30979r;
import p715zg.C31828b;
import p715zg.C31829c;
import p715zg.C31830d;
import p716zh.C31877d;
import v00.C27419n;
import yf0.C30955t;

/* renamed from: wg.g */
/* loaded from: classes3.dex */
public final class C28971g {

    /* renamed from: a */
    private final InterfaceC27218a f134085a;

    /* renamed from: b */
    private final String f134086b;

    /* renamed from: c */
    private final InterfaceC25792a.c f134087c;

    /* renamed from: d */
    private final InterfaceC25792a.b f134088d;

    /* renamed from: e */
    private final int f134089e;

    /* renamed from: f */
    private final C31877d f134090f;

    /* renamed from: g */
    private final String f134091g;

    public C28971g(InterfaceC27218a interfaceC27218a, String str, InterfaceC25792a.c cVar, InterfaceC25792a.b bVar, int i11, C31877d c31877d, String str2) {
        this.f134085a = interfaceC27218a;
        this.f134086b = str;
        this.f134087c = cVar;
        this.f134088d = bVar;
        this.f134089e = i11;
        this.f134090f = c31877d;
        this.f134091g = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* renamed from: a */
    public final InterfaceC28970f m144684a(String str) {
        InterfaceC28970f c28966b;
        InterfaceC27218a interfaceC27218a;
        InterfaceC27218a interfaceC27218a2;
        AbstractC19074t.m100208f(str, "action");
        switch (str.hashCode()) {
            case -1674667341:
                if (!str.equals("action.lfs.file.info")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case -1674381438:
                if (!str.equals("action.lfs.file.save")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case -1642935676:
                if (!str.equals("action.mp.open.profile.picker")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case -1470175359:
                if (!str.equals("action.open.channel_profile")) {
                    return null;
                }
                return new C30975n(this.f134085a, this.f134086b, new C27419n());
            case -1220875056:
                if (!str.equals("action.open.channel_search")) {
                    return null;
                }
                return new C30977p(this.f134085a, this.f134086b, new C27419n());
            case -874039359:
                if (!str.equals("action.open.addclosefriend")) {
                    return null;
                }
                c28966b = new C28966b(this.f134085a, null, 2, null);
                return c28966b;
            case -819287323:
                if (!str.equals("action.ma.menu.open.description")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case -463201884:
                if (!str.equals("action.open.channel_hashtag")) {
                    return null;
                }
                return new C30965d(this.f134085a, this.f134086b, new C27419n());
            case -62560970:
                if (!str.equals("action.prompt.authentication.check_state") || (interfaceC27218a = this.f134085a) == null) {
                    return null;
                }
                return new C28969e(interfaceC27218a, this.f134087c);
            case 80990294:
                if (!str.equals("action.iap.isSupported")) {
                    return null;
                }
                return new C29622a(this.f134087c, str, this.f134086b, this.f134089e);
            case 277544157:
                if (!str.equals("action.open.channel_location")) {
                    return null;
                }
                return new C30979r(this.f134085a, this.f134086b, new C27419n());
            case 290719370:
                if (!str.equals("action.prompt.authentication") || (interfaceC27218a2 = this.f134085a) == null) {
                    return null;
                }
                return new C28975k(interfaceC27218a2, this.f134087c, this.f134088d, this.f134086b, null, this.f134091g, 16, null);
            case 310418310:
                if (!str.equals("action.mp.join.wifi")) {
                    return null;
                }
                return new C31829c(this.f134086b, this.f134091g, this.f134087c, this.f134085a, C30955t.Companion.m150567a());
            case 353164316:
                if (!str.equals("action.ma.menu.permission")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 614113314:
                if (!str.equals("action.open.channel_iab")) {
                    return null;
                }
                return new C30969h(this.f134085a, this.f134086b, new C27419n());
            case 822121606:
                if (!str.equals("action.open.mediapicker")) {
                    return null;
                }
                c28966b = new C28974j(this.f134085a, null, 2, null);
                return c28966b;
            case 845188139:
                if (!str.equals("action.ma.menu.minimize")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 895508538:
                if (!str.equals("action.open.channel_streaming")) {
                    return null;
                }
                return new C30971j(this.f134085a, this.f134086b, new C27419n());
            case 962741438:
                if (!str.equals("action.view.myqr")) {
                    return null;
                }
                return new C28977m(this.f134086b, str, this.f134085a, this.f134087c, null, 16, null);
            case 1032485141:
                if (!str.equals("action.copy.clipboard")) {
                    return null;
                }
                return new C28972h(new C23255x(), MainApplication.Companion.m35500c(), this.f134086b);
            case 1078199380:
                if (!str.equals("action.mp.get.number")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 1298571685:
                if (!str.equals("action.iap.requestpayment")) {
                    return null;
                }
                return new C29622a(this.f134087c, str, this.f134086b, this.f134089e);
            case 1388548166:
                if (!str.equals("action.open.my_channel_profile")) {
                    return null;
                }
                return new C30973l(this.f134085a, this.f134086b, new C27419n());
            case 1439874418:
                if (!str.equals("action.ma.menu.share")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 1443783110:
                if (!str.equals("action.open.channel_collection")) {
                    return null;
                }
                return new C30963b(this.f134085a, this.f134086b, new C27419n());
            case 1506984265:
                if (!str.equals("action.lfs.file.remove")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 1642933375:
                if (!str.equals("action.open.outapp")) {
                    return null;
                }
                return new C0859b(this.f134085a, this.f134087c, str, this.f134086b, this.f134089e, this.f134090f, this.f134088d, new a81());
            case 1655359078:
                if (!str.equals("action.ma.menu.reload")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 1697177859:
                if (!str.equals("action.ma.menu.copy.url")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 1703784998:
                if (!str.equals("action.mp.get.visitor.id")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 1717357848:
                if (!str.equals("action.ma.menu.open.qr")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 1778362311:
                if (!str.equals("action.mp.permission.sync")) {
                    return null;
                }
                return new C31830d(str, this.f134086b, this.f134087c);
            case 1857627655:
                if (!str.equals("action.open.channel_home")) {
                    return null;
                }
                return new C30967f(this.f134085a, this.f134086b, new C27419n());
            case 1861755347:
                if (!str.equals("action.ma.menu.shortcut")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 1986893040:
                if (!str.equals("action.open.inapp")) {
                    return null;
                }
                return new C0859b(this.f134085a, this.f134087c, str, this.f134086b, this.f134089e, this.f134090f, this.f134088d, new a81());
            case 2027607019:
                if (!str.equals("action.lfs.list")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            case 2122176106:
                if (!str.equals("action.ma.menu.favorites")) {
                    return null;
                }
                return new C31828b(str, this.f134086b, this.f134091g, this.f134088d);
            default:
                return null;
        }
    }
}
