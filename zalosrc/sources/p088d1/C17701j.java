package p088d1;

import p045c1.C3186e;
import p045c1.C3189h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d1.j */
/* loaded from: classes2.dex */
public class C17701j extends AbstractC17707p {
    public C17701j(C3186e c3186e) {
        super(c3186e);
        c3186e.f13529e.mo93719f();
        c3186e.f13531f.mo93719f();
        this.f89781f = ((C3189h) c3186e).m16230v1();
    }

    /* renamed from: q */
    private void m93752q(C17697f c17697f) {
        this.f89783h.f89733k.add(c17697f);
        c17697f.f89734l.add(this.f89783h);
    }

    @Override // p088d1.AbstractC17707p, p088d1.InterfaceC17695d
    /* renamed from: a */
    public void mo93716a(InterfaceC17695d interfaceC17695d) {
        C17697f c17697f = this.f89783h;
        if (!c17697f.f89725c || c17697f.f89732j) {
            return;
        }
        this.f89783h.mo93738d((int) ((((C17697f) c17697f.f89734l.get(0)).f89729g * ((C3189h) this.f89777b).m16233y1()) + 0.5f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p088d1.AbstractC17707p
    /* renamed from: d */
    public void mo93717d() {
        C3189h c3189h = (C3189h) this.f89777b;
        int m16231w1 = c3189h.m16231w1();
        int m16232x1 = c3189h.m16232x1();
        c3189h.m16233y1();
        if (c3189h.m16230v1() == 1) {
            if (m16231w1 != -1) {
                this.f89783h.f89734l.add(this.f89777b.f13526c0.f13529e.f89783h);
                this.f89777b.f13526c0.f13529e.f89783h.f89733k.add(this.f89783h);
                this.f89783h.f89728f = m16231w1;
            } else if (m16232x1 != -1) {
                this.f89783h.f89734l.add(this.f89777b.f13526c0.f13529e.f89784i);
                this.f89777b.f13526c0.f13529e.f89784i.f89733k.add(this.f89783h);
                this.f89783h.f89728f = -m16232x1;
            } else {
                C17697f c17697f = this.f89783h;
                c17697f.f89724b = true;
                c17697f.f89734l.add(this.f89777b.f13526c0.f13529e.f89784i);
                this.f89777b.f13526c0.f13529e.f89784i.f89733k.add(this.f89783h);
            }
            m93752q(this.f89777b.f13529e.f89783h);
            m93752q(this.f89777b.f13529e.f89784i);
            return;
        }
        if (m16231w1 != -1) {
            this.f89783h.f89734l.add(this.f89777b.f13526c0.f13531f.f89783h);
            this.f89777b.f13526c0.f13531f.f89783h.f89733k.add(this.f89783h);
            this.f89783h.f89728f = m16231w1;
        } else if (m16232x1 != -1) {
            this.f89783h.f89734l.add(this.f89777b.f13526c0.f13531f.f89784i);
            this.f89777b.f13526c0.f13531f.f89784i.f89733k.add(this.f89783h);
            this.f89783h.f89728f = -m16232x1;
        } else {
            C17697f c17697f2 = this.f89783h;
            c17697f2.f89724b = true;
            c17697f2.f89734l.add(this.f89777b.f13526c0.f13531f.f89784i);
            this.f89777b.f13526c0.f13531f.f89784i.f89733k.add(this.f89783h);
        }
        m93752q(this.f89777b.f13531f.f89783h);
        m93752q(this.f89777b.f13531f.f89784i);
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: e */
    public void mo93718e() {
        if (((C3189h) this.f89777b).m16230v1() == 1) {
            this.f89777b.m16111p1(this.f89783h.f89729g);
        } else {
            this.f89777b.m16113q1(this.f89783h.f89729g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p088d1.AbstractC17707p
    /* renamed from: f */
    public void mo93719f() {
        this.f89783h.m93737c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p088d1.AbstractC17707p
    /* renamed from: m */
    public boolean mo93721m() {
        return false;
    }
}
