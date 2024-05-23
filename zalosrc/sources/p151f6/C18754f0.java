package p151f6;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import p598w5.AbstractBinderC28744c;
import p598w5.AbstractC28740a;
import p598w5.AbstractC28768z;
import p598w5.InterfaceC28746d;

/* renamed from: f6.f0 */
/* loaded from: classes2.dex */
public final class C18754f0 extends AbstractC28740a implements InterfaceC18745b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C18754f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: E4 */
    public final void mo98733E4(boolean z11) {
        Parcel m143868N = m143868N();
        int i11 = AbstractC28768z.f133302b;
        m143868N.writeInt(z11 ? 1 : 0);
        m143869Q(22, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: L1 */
    public final void mo98734L1(InterfaceC18761j interfaceC18761j) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC18761j);
        m143869Q(42, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: L3 */
    public final void mo98735L3(InterfaceC18764k0 interfaceC18764k0) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC18764k0);
        m143869Q(99, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: M0 */
    public final CameraPosition mo98736M0() {
        Parcel m143867E = m143867E(1, m143868N());
        CameraPosition cameraPosition = (CameraPosition) AbstractC28768z.m143902a(m143867E, CameraPosition.CREATOR);
        m143867E.recycle();
        return cameraPosition;
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: M4 */
    public final void mo98737M4(InterfaceC18779v interfaceC18779v, InterfaceC4271b interfaceC4271b) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC18779v);
        AbstractC28768z.m143905d(m143868N, interfaceC4271b);
        m143869Q(38, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: O2 */
    public final void mo98738O2(InterfaceC18769n interfaceC18769n) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC18769n);
        m143869Q(30, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: S4 */
    public final Location mo98739S4() {
        Parcel m143867E = m143867E(23, m143868N());
        Location location = (Location) AbstractC28768z.m143902a(m143867E, Location.CREATOR);
        m143867E.recycle();
        return location;
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: U1 */
    public final InterfaceC18749d mo98740U1() {
        InterfaceC18749d c18777t;
        Parcel m143867E = m143867E(26, m143868N());
        IBinder readStrongBinder = m143867E.readStrongBinder();
        if (readStrongBinder == null) {
            c18777t = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (queryLocalInterface instanceof InterfaceC18749d) {
                c18777t = (InterfaceC18749d) queryLocalInterface;
            } else {
                c18777t = new C18777t(readStrongBinder);
            }
        }
        m143867E.recycle();
        return c18777t;
    }

    @Override // p151f6.InterfaceC18745b
    public final void clear() {
        m143869Q(14, m143868N());
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: e3 */
    public final void mo98741e3(int i11, int i12, int i13, int i14) {
        Parcel m143868N = m143868N();
        m143868N.writeInt(i11);
        m143868N.writeInt(i12);
        m143868N.writeInt(i13);
        m143868N.writeInt(i14);
        m143869Q(39, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: g4 */
    public final InterfaceC18755g mo98742g4() {
        InterfaceC18755g c18783z;
        Parcel m143867E = m143867E(25, m143868N());
        IBinder readStrongBinder = m143867E.readStrongBinder();
        if (readStrongBinder == null) {
            c18783z = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof InterfaceC18755g) {
                c18783z = (InterfaceC18755g) queryLocalInterface;
            } else {
                c18783z = new C18783z(readStrongBinder);
            }
        }
        m143867E.recycle();
        return c18783z;
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: k1 */
    public final void mo98743k1(int i11) {
        Parcel m143868N = m143868N();
        m143868N.writeInt(i11);
        m143869Q(16, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: k3 */
    public final void mo98744k3(InterfaceC18760i0 interfaceC18760i0) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC18760i0);
        m143869Q(27, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: m3 */
    public final void mo98745m3(InterfaceC4271b interfaceC4271b) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC4271b);
        m143869Q(4, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: n4 */
    public final void mo98746n4(InterfaceC4271b interfaceC4271b, int i11, InterfaceC18748c0 interfaceC18748c0) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC4271b);
        m143868N.writeInt(i11);
        AbstractC28768z.m143905d(m143868N, interfaceC18748c0);
        m143869Q(7, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: q3 */
    public final boolean mo98747q3(MapStyleOptions mapStyleOptions) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143904c(m143868N, mapStyleOptions);
        Parcel m143867E = m143867E(91, m143868N);
        boolean m143906e = AbstractC28768z.m143906e(m143867E);
        m143867E.recycle();
        return m143906e;
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: s0 */
    public final void mo98748s0(InterfaceC18768m0 interfaceC18768m0) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC18768m0);
        m143869Q(97, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: t1 */
    public final void mo98749t1(InterfaceC18774q interfaceC18774q) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC18774q);
        m143869Q(36, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: u3 */
    public final void mo98750u3(InterfaceC18772o0 interfaceC18772o0) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143905d(m143868N, interfaceC18772o0);
        m143869Q(96, m143868N);
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: w0 */
    public final boolean mo98751w0() {
        Parcel m143867E = m143867E(21, m143868N());
        boolean m143906e = AbstractC28768z.m143906e(m143867E);
        m143867E.recycle();
        return m143906e;
    }

    @Override // p151f6.InterfaceC18745b
    /* renamed from: w2 */
    public final InterfaceC28746d mo98752w2(MarkerOptions markerOptions) {
        Parcel m143868N = m143868N();
        AbstractC28768z.m143904c(m143868N, markerOptions);
        Parcel m143867E = m143867E(11, m143868N);
        InterfaceC28746d m143879N = AbstractBinderC28744c.m143879N(m143867E.readStrongBinder());
        m143867E.recycle();
        return m143879N;
    }
}
