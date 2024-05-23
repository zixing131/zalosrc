package l70;

import am.AbstractC0924m0;
import com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23265y;
import org.json.JSONException;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p276jt.C21357l;
import p298kf.C21700a;
import p646xi.C29669a;
import se.AbstractC26235a;

/* renamed from: l70.b */
/* loaded from: classes5.dex */
public final class C22106b extends AbstractC19962a implements InterfaceC12098a {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private final C29669a f108855t;

    /* renamed from: u */
    public int f108856u;

    /* renamed from: v */
    private int f108857v;

    /* renamed from: w */
    private List f108858w;

    /* renamed from: x */
    private AbstractC26235a f108859x;

    /* renamed from: y */
    private int f108860y;

    /* renamed from: l70.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22106b(InterfaceC22105a interfaceC22105a, C29669a c29669a) {
        super(interfaceC22105a);
        AbstractC19074t.m100208f(interfaceC22105a, "mvpView");
        AbstractC19074t.m100208f(c29669a, "cameraRepository");
        this.f108855t = c29669a;
        this.f108856u = 2;
        this.f108857v = 1;
        this.f108858w = new ArrayList();
    }

    /* renamed from: Ip */
    private final void m115325Ip() {
        InterfaceC22105a interfaceC22105a = (InterfaceC22105a) m103742Dp();
        interfaceC22105a.mo67446I6(this.f108857v);
        interfaceC22105a.mo67461iG(this.f108857v);
    }

    /* renamed from: Kp */
    private final C21700a m115326Kp() {
        int size = this.f108858w.size();
        int i11 = this.f108860y;
        if (i11 >= 0 && i11 < size) {
            return (C21700a) this.f108858w.get(i11);
        }
        return null;
    }

    /* renamed from: Mp */
    private final void m115327Mp() {
        InterfaceC22105a interfaceC22105a = (InterfaceC22105a) m103742Dp();
        interfaceC22105a.setColorPaletteData(this.f108855t.m147491d());
        interfaceC22105a.setColorPaletteSelectedPos(this.f108855t.m147493f());
    }

    /* renamed from: Op */
    private final boolean m115328Op() {
        int i11 = this.f108856u;
        return i11 == 0 || i11 == 1;
    }

    /* renamed from: Qp */
    private final void m115329Qp() {
        try {
            int m115333Jp = m115333Jp(mo67475Oh());
            C21700a m115326Kp = m115326Kp();
            InterfaceC22105a interfaceC22105a = (InterfaceC22105a) m103742Dp();
            interfaceC22105a.mo67445Aq(m115326Kp);
            interfaceC22105a.mo67450Qs(m115333Jp, m115328Op());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Rp */
    private final void m115330Rp() {
        AbstractC26235a abstractC26235a = this.f108859x;
        if (abstractC26235a instanceof AbstractC26235a.a) {
            AbstractC19074t.m100206d(abstractC26235a, "null cannot be cast to non-null type com.zing.zalo.camera.colorpalette.model.ColorItem.CaptionFillData");
            m115331Sp((AbstractC26235a.a) abstractC26235a);
            m115329Qp();
        }
    }

    /* renamed from: Sp */
    private final void m115331Sp(AbstractC26235a.a aVar) {
        InterfaceC22105a interfaceC22105a = (InterfaceC22105a) m103742Dp();
        if (m115328Op()) {
            interfaceC22105a.mo67465pi(aVar.m134887e());
        } else {
            interfaceC22105a.mo67460iF(aVar.m134888f(), aVar.m134887e(), aVar.m134885c());
        }
    }

    /* renamed from: Tp */
    private final void m115332Tp(boolean z11) {
        Iterator it = this.f108858w.iterator();
        while (it.hasNext()) {
            ((C21700a) it.next()).m111997h(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: Cj */
    public void mo67469Cj() {
        m115335Pp((this.f108857v + 1) % 3);
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: E0 */
    public void mo67470E0(float f11) {
        ((InterfaceC22105a) m103742Dp()).mo67464ng(f11);
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: Fe */
    public int mo67471Fe() {
        return this.f108860y;
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: G6 */
    public void mo67472G6() {
        this.f108860y = (this.f108860y + 1) % this.f108858w.size();
        ((InterfaceC22105a) m103742Dp()).mo67451Sp(m115326Kp());
        m115330Rp();
    }

    /* renamed from: Jp */
    public final int m115333Jp(boolean z11) {
        return z11 ? 66 : 255;
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: Ne */
    public void mo67473Ne() {
        m115327Mp();
        this.f108860y = AbstractC0924m0.m3094H();
        this.f108858w = this.f108855t.m147492e();
    }

    /* renamed from: Np */
    public boolean m115334Np() {
        int i11 = this.f108856u;
        return i11 == 2 || i11 == 3;
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: O5 */
    public void mo67474O5(int i11) {
        this.f108855t.m147505s(i11);
        AbstractC0924m0.m4110pe(this.f108860y);
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: Oh */
    public boolean mo67475Oh() {
        int i11 = this.f108856u;
        return i11 == 1 || i11 == 3;
    }

    /* renamed from: Pp */
    public final void m115335Pp(int i11) {
        this.f108857v = i11;
        m115325Ip();
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: Q3 */
    public void mo67476Q3() {
        ((InterfaceC22105a) m103742Dp()).mo67448Q3();
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: R7 */
    public void mo67477R7(int i11) {
        this.f108856u = i11;
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: S1 */
    public void mo67478S1(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        try {
            jSONObject.put("caption_mode", this.f108856u);
            jSONObject.put("caption_align", this.f108857v);
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: Un */
    public C21357l mo67479Un(String str, int i11, int i12, float f11) {
        AbstractC19074t.m100208f(str, "text");
        if (str.length() > 0) {
            AbstractC26235a abstractC26235a = this.f108859x;
            if (abstractC26235a instanceof AbstractC26235a.a) {
                AbstractC19074t.m100206d(abstractC26235a, "null cannot be cast to non-null type com.zing.zalo.camera.colorpalette.model.ColorItem.CaptionFillData");
                AbstractC26235a.a aVar = (AbstractC26235a.a) abstractC26235a;
                int m134887e = aVar.m134887e();
                int m134885c = aVar.m134885c();
                C21357l.b bVar = new C21357l.b();
                bVar.f104095b = "fonts/Roboto-Bold.ttf";
                bVar.f104097d = m134887e;
                bVar.f104098e = AbstractC23265y.m120020g(m134887e);
                bVar.f104106m = i11;
                bVar.f104107n = 0;
                bVar.f104108o = AbstractC23222t7.f112552c;
                bVar.f104109p = f11;
                C21700a m115326Kp = m115326Kp();
                if (m115326Kp != null) {
                    if (m115328Op()) {
                        bVar.f104094a = m115326Kp.m111992c();
                        bVar.f104095b = m115326Kp.m111991b();
                        bVar.f104096c = m115326Kp.m111993d();
                        bVar.f104105l = m115326Kp.m111994e();
                        bVar.f104103j = m115326Kp.m111996g();
                    } else {
                        bVar.f104094a = m115326Kp.m111992c();
                        bVar.f104097d = aVar.m134888f();
                        bVar.f104095b = m115326Kp.m111991b();
                        bVar.f104096c = m115326Kp.m111993d();
                        bVar.f104105l = m115326Kp.m111994e();
                        bVar.f104102i = true;
                        bVar.f104103j = m115326Kp.m111996g();
                        if (m134887e != m134885c) {
                            bVar.f104100g = m134887e;
                            bVar.f104101h = m134885c;
                            bVar.f104104k = true;
                        } else {
                            bVar.f104099f = m134887e;
                        }
                    }
                }
                C21357l c21357l = new C21357l(str, 0, 0, bVar, 0, this.f108856u, this.f108857v, AbstractC23136l9.m118707f0());
                c21357l.f104081g0 = i12;
                c21357l.f104082h0 = this.f108860y;
                ((InterfaceC22105a) m103742Dp()).mo67462j("121N022");
                return c21357l;
            }
        }
        ((InterfaceC22105a) m103742Dp()).mo67462j("121N023");
        return null;
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: Zc */
    public void mo67480Zc(int i11) {
        if (this.f108857v != i11) {
            m115335Pp(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: a5 */
    public void mo67481a5(AbstractC26235a abstractC26235a, boolean z11) {
        this.f108859x = abstractC26235a;
        if (z11) {
            ((InterfaceC22105a) m103742Dp()).mo67462j("121N072");
        }
        m115330Rp();
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: a8 */
    public void mo67482a8(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f108856u = jSONObject.optInt("caption_mode", 2);
        m115335Pp(jSONObject.optInt("caption_align", 1));
        if (jSONObject.optBoolean("caption_is_adding", true)) {
            C21357l c21357l = new C21357l(jSONObject.optString("caption_text"), new C21357l.b(), 0, this.f108856u, this.f108857v, AbstractC23136l9.m118707f0());
            c21357l.f104081g0 = jSONObject.optInt("color_selected_pos");
            c21357l.f104082h0 = jSONObject.optInt("font_picker_pos");
            ((InterfaceC22105a) m103742Dp()).mo67449Qe(c21357l);
        }
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: fh */
    public void mo67483fh() {
        ((InterfaceC22105a) m103742Dp()).mo67463l();
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: h1 */
    public void mo67484h1(boolean z11) {
        ((InterfaceC22105a) m103742Dp()).mo67457h1(z11);
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: jc */
    public void mo67485jc() {
        int i11 = (this.f108856u + 1) % 4;
        this.f108856u = i11;
        AbstractC0924m0.m4050ne(i11);
        m115332Tp(mo67475Oh());
        ((InterfaceC22105a) m103742Dp()).mo67466wi(m115334Np());
        ((InterfaceC22105a) m103742Dp()).mo67451Sp(m115326Kp());
        m115330Rp();
        ((InterfaceC22105a) m103742Dp()).mo67462j("121N070");
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: of */
    public void mo67486of(int i11) {
        this.f108860y = i11;
        ((InterfaceC22105a) m103742Dp()).mo67451Sp(m115326Kp());
    }

    @Override // com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a
    /* renamed from: ol */
    public int mo67487ol() {
        return this.f108858w.size();
    }
}
