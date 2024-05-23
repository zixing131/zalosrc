package n70;

import com.zing.zalo.AbstractC16803z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23244v8;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p205hc.InterfaceC19969h;
import p646xi.C29669a;
import p664y.AbstractC30228a;
import se.AbstractC26235a;

/* renamed from: n70.c */
/* loaded from: classes5.dex */
public class C23604c extends AbstractC19962a implements InterfaceC23602a {

    /* renamed from: A */
    EnumC23613l f114455A;

    /* renamed from: t */
    private final C29669a f114456t;

    /* renamed from: u */
    private final List f114457u;

    /* renamed from: v */
    private AbstractC26235a.c f114458v;

    /* renamed from: w */
    private int f114459w;

    /* renamed from: x */
    int f114460x;

    /* renamed from: y */
    int f114461y;

    /* renamed from: z */
    int f114462z;

    public C23604c(InterfaceC23603b interfaceC23603b, C29669a c29669a) {
        super(interfaceC23603b);
        this.f114457u = new ArrayList();
        this.f114460x = 0;
        this.f114461y = 2;
        this.f114462z = 0;
        this.f114455A = EnumC23613l.f114470p;
        this.f114456t = c29669a;
    }

    /* renamed from: Ip */
    private List m123769Ip(boolean z11) {
        boolean z12;
        if (this.f114457u.isEmpty()) {
            int[] m147498k = this.f114456t.m147498k();
            for (int i11 = 0; i11 < m147498k.length; i11++) {
                if (i11 == this.f114456t.m147497j()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f114457u.add(new AbstractC26235a.b(m147498k[i11], z12));
            }
        }
        if (z11) {
            if (this.f114458v == null) {
                this.f114458v = new AbstractC26235a.c(AbstractC16803z.icn_doodle_colour_list_blurred);
            }
            if (!m123771Kp()) {
                this.f114457u.add(0, this.f114458v);
            }
        } else if (m123771Kp()) {
            this.f114457u.remove(0);
        }
        return this.f114457u;
    }

    /* renamed from: Jp */
    private void m123770Jp(boolean z11) {
        ((InterfaceC23603b) m103742Dp()).mo67532Hf(mo123763qm());
        if (mo123763qm()) {
            m123775Rp(this.f114460x, z11);
        } else {
            m123776Sp(this.f114461y, z11);
            ((InterfaceC23603b) m103742Dp()).mo67545fy("doodle_squarebrush");
        }
        ((InterfaceC23603b) m103742Dp()).mo67549ln();
        ((InterfaceC23603b) m103742Dp()).mo67547j("121N055");
    }

    /* renamed from: Kp */
    private boolean m123771Kp() {
        if (this.f114457u.isEmpty() || !(this.f114457u.get(0) instanceof AbstractC26235a.c)) {
            return false;
        }
        return true;
    }

    /* renamed from: Mp */
    private void m123772Mp(boolean z11) {
        int size = this.f114457u.size();
        List m123769Ip = m123769Ip(z11);
        ((InterfaceC23603b) m103742Dp()).setColorPaletteData(m123769Ip);
        if (size != 0 && size != m123769Ip.size()) {
            Iterator it = m123769Ip.iterator();
            while (it.hasNext()) {
                ((AbstractC26235a) it.next()).m134884b(false);
            }
        }
    }

    /* renamed from: Pp */
    private void m123773Pp() {
        this.f114456t.m147506t(this.f114460x);
        this.f114456t.m147507u(this.f114461y);
    }

    /* renamed from: Qp */
    private void m123774Qp(boolean z11) {
        int i11;
        InterfaceC23603b interfaceC23603b = (InterfaceC23603b) m103742Dp();
        if (z11) {
            i11 = 3;
        } else {
            i11 = this.f114460x;
        }
        interfaceC23603b.setCurrentBrushType(i11);
        ((InterfaceC23603b) m103742Dp()).setCurrentShapeType(this.f114461y);
        ((InterfaceC23603b) m103742Dp()).mo67546hs();
    }

    /* renamed from: Rp */
    private void m123775Rp(int i11, boolean z11) {
        if (i11 != this.f114460x) {
            this.f114460x = i11;
            if (!z11) {
                ((InterfaceC23603b) m103742Dp()).setCurrentBrushType(i11);
            }
        }
        ((InterfaceC23603b) m103742Dp()).mo67551np(this.f114459w, i11);
        ((InterfaceC23603b) m103742Dp()).setBrushActiveButtonImage(i11);
        ((InterfaceC23603b) m103742Dp()).mo67546hs();
    }

    /* renamed from: Sp */
    private void m123776Sp(int i11, boolean z11) {
        if (i11 != this.f114461y) {
            this.f114461y = i11;
            if (!z11) {
                ((InterfaceC23603b) m103742Dp()).setCurrentShapeType(i11);
            }
        }
        ((InterfaceC23603b) m103742Dp()).mo67540PA(this.f114459w, i11);
        ((InterfaceC23603b) m103742Dp()).setShapeActiveButtonImage(i11);
        if (this.f114456t.m147502p()) {
            ((InterfaceC23603b) m103742Dp()).mo67529DI();
            this.f114456t.m147504r();
        } else {
            ((InterfaceC23603b) m103742Dp()).mo67546hs();
        }
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: Am */
    public boolean mo123744Am() {
        if (this.f114455A == EnumC23613l.f114472r) {
            return true;
        }
        return false;
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: E0 */
    public void mo123745E0(float f11) {
        ((InterfaceC23603b) m103742Dp()).setCurrentSize((int) ((f11 * 90.0f) + 10.0f));
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: H5 */
    public void mo123746H5(AbstractC26235a abstractC26235a, boolean z11) {
        ((InterfaceC23603b) m103742Dp()).mo67549ln();
        if (abstractC26235a instanceof AbstractC26235a.b) {
            m123774Qp(false);
            this.f114459w = ((AbstractC26235a.b) abstractC26235a).m134891c();
            ((InterfaceC23603b) m103742Dp()).setCurrentColor(this.f114459w);
            if (mo123763qm()) {
                ((InterfaceC23603b) m103742Dp()).mo67551np(this.f114459w, this.f114460x);
            } else if (m123777Np()) {
                ((InterfaceC23603b) m103742Dp()).mo67540PA(this.f114459w, this.f114461y);
            }
            ((InterfaceC23603b) m103742Dp()).mo67530Dn(this.f114459w);
        } else if (abstractC26235a instanceof AbstractC26235a.c) {
            m123774Qp(true);
        }
        if (z11) {
            ((InterfaceC23603b) m103742Dp()).mo67547j("121N054");
        }
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: H8 */
    public void mo123747H8(EnumC23613l enumC23613l) {
        this.f114455A = enumC23613l;
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: Hd */
    public void mo123748Hd(boolean z11) {
        int i11;
        boolean z12;
        m123772Mp(z11);
        InterfaceC23603b interfaceC23603b = (InterfaceC23603b) m103742Dp();
        if (z11) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        interfaceC23603b.setColorPaletteSelectedPos(i11);
        InterfaceC23603b interfaceC23603b2 = (InterfaceC23603b) m103742Dp();
        if (this.f114462z == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        interfaceC23603b2.mo67532Hf(z12);
        ((InterfaceC23603b) m103742Dp()).mo67548lH();
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: N5 */
    public void mo123749N5() {
        if (mo123764sm()) {
            ((InterfaceC23603b) m103742Dp()).mo67542Yl();
        } else if (mo123744Am()) {
            ((InterfaceC23603b) m103742Dp()).mo67533Hx();
            ((InterfaceC23603b) m103742Dp()).mo67546hs();
        } else {
            ((InterfaceC23603b) m103742Dp()).mo67555uv();
            ((InterfaceC23603b) m103742Dp()).mo67546hs();
        }
        ((InterfaceC23603b) m103742Dp()).mo67547j("121N057");
        ((InterfaceC23603b) m103742Dp()).mo67545fy("doodle_undo");
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: Nb */
    public void mo123750Nb(boolean z11) {
        if (m123777Np()) {
            return;
        }
        this.f114462z = 1;
        m123770Jp(z11);
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public /* bridge */ /* synthetic */ void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        AbstractC30228a.m149044a(interfaceC19969h);
        m123778Op(null, interfaceC19968g);
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: Nj */
    public void mo123751Nj(int i11) {
        ((InterfaceC23603b) m103742Dp()).mo67537L6();
    }

    /* renamed from: Np */
    public boolean m123777Np() {
        return this.f114462z == 1;
    }

    /* renamed from: Op */
    public void m123778Op(AbstractC23612k abstractC23612k, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(abstractC23612k, interfaceC19968g);
        if (this.f114456t.m147501o() && this.f114455A != EnumC23613l.f114471q) {
            ((InterfaceC23603b) m103742Dp()).mo67543bI();
            this.f114456t.m147503q();
        }
        ((InterfaceC23603b) m103742Dp()).mo67552og(this.f114456t.m147500n());
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: S1 */
    public void mo123752S1(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        ((InterfaceC23603b) m103742Dp()).mo67534JE(jSONObject);
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: Se */
    public void mo123753Se() {
        m123772Mp(true);
        ((InterfaceC23603b) m103742Dp()).setColorPaletteSelectedPos(0);
        ((InterfaceC23603b) m103742Dp()).mo67548lH();
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: Yf */
    public void mo123754Yf(boolean z11) {
        m123776Sp(2, z11);
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: Yl */
    public void mo123755Yl() {
        m123773Pp();
        ((InterfaceC23603b) m103742Dp()).mo67525Bv();
        ((InterfaceC23603b) m103742Dp()).mo67547j("121N057");
        ((InterfaceC23603b) m103742Dp()).mo67545fy("doodle_done_notclear");
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: b8 */
    public void mo123756b8(boolean z11) {
        m123776Sp(1, z11);
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: c9 */
    public void mo123757c9(String str) {
        if (!AbstractC23244v8.m119753q(str)) {
            ((InterfaceC23603b) m103742Dp()).mo67541Ru(str);
        }
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: l6 */
    public void mo123758l6() {
        m123773Pp();
        ((InterfaceC23603b) m103742Dp()).mo67557z7();
        ((InterfaceC23603b) m103742Dp()).mo67545fy("doodle_back_notclear");
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: lm */
    public void mo123759lm(boolean z11, int i11) {
        this.f114460x = this.f114456t.m147495h();
        this.f114461y = this.f114456t.m147496i();
        ((InterfaceC23603b) m103742Dp()).setBrushActiveButtonImage(this.f114460x);
        this.f114459w = i11;
        ((InterfaceC23603b) m103742Dp()).setCurrentColor(this.f114459w);
        ((InterfaceC23603b) m103742Dp()).mo67551np(this.f114459w, this.f114460x);
        ((InterfaceC23603b) m103742Dp()).mo67530Dn(this.f114459w);
        ((InterfaceC23603b) m103742Dp()).mo67548lH();
        if (z11) {
            m123774Qp(true);
        } else {
            ((InterfaceC23603b) m103742Dp()).setCurrentBrushType(this.f114460x);
            ((InterfaceC23603b) m103742Dp()).setCurrentShapeType(this.f114461y);
        }
        ((InterfaceC23603b) m103742Dp()).setCurrentSize(10);
        ((InterfaceC23603b) m103742Dp()).setSizePickerLocation(1.0f);
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: nd */
    public void mo123760nd(boolean z11) {
        m123775Rp(2, z11);
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: oe */
    public void mo123761oe(boolean z11) {
        m123775Rp(0, z11);
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: qh */
    public void mo123762qh() {
        this.f114460x = 0;
        this.f114461y = 2;
        this.f114462z = 0;
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: qm */
    public boolean mo123763qm() {
        return this.f114462z == 0;
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: sm */
    public boolean mo123764sm() {
        if (this.f114455A == EnumC23613l.f114471q) {
            return true;
        }
        return false;
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: tj */
    public void mo123765tj(boolean z11) {
        if (mo123763qm()) {
            return;
        }
        this.f114462z = 0;
        m123770Jp(z11);
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: u5 */
    public void mo123766u5(boolean z11) {
        m123776Sp(0, z11);
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: u6 */
    public void mo123767u6(boolean z11) {
        m123775Rp(1, z11);
    }

    @Override // n70.InterfaceC23602a
    /* renamed from: xf */
    public void mo123768xf() {
        ((InterfaceC23603b) m103742Dp()).mo67554u9();
        if (mo123763qm()) {
            ((InterfaceC23603b) m103742Dp()).mo67544cI();
        } else if (m123777Np()) {
            ((InterfaceC23603b) m103742Dp()).mo67539OG();
        }
        ((InterfaceC23603b) m103742Dp()).mo67547j("121N056");
    }
}
