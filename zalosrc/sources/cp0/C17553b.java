package cp0;

import ag0.AbstractC0837p0;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.media.AudioManager;
import ho0.AbstractC20110a;
import java.util.Iterator;
import mm0.AbstractC23350e;

/* renamed from: cp0.b */
/* loaded from: classes.dex */
public class C17553b {

    /* renamed from: e */
    private static C17553b f89435e;

    /* renamed from: a */
    protected BluetoothAdapter f89436a;

    /* renamed from: b */
    protected Context f89437b;

    /* renamed from: c */
    private AudioManager f89438c;

    /* renamed from: d */
    private boolean f89439d = false;

    protected C17553b() {
    }

    /* renamed from: c */
    public static C17553b m93488c(Context context) {
        if (f89435e == null) {
            C17553b c17553b = new C17553b();
            f89435e = c17553b;
            c17553b.m93495i(context);
        }
        return f89435e;
    }

    /* renamed from: d */
    private void m93489d(boolean z11) {
        AudioManager audioManager = this.f89438c;
        if (audioManager == null) {
            return;
        }
        if (z11) {
            audioManager.setBluetoothScoOn(true);
            this.f89438c.startBluetoothSco();
        } else {
            audioManager.setBluetoothScoOn(false);
            this.f89438c.stopBluetoothSco();
        }
        this.f89439d = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m93490g() {
        try {
            Thread.sleep(500L);
            m93489d(true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: b */
    public boolean m93491b() {
        if (this.f89436a == null || !this.f89438c.isBluetoothScoAvailableOffCall() || !this.f89436a.isEnabled()) {
            return false;
        }
        Iterator<BluetoothDevice> it = this.f89436a.getBondedDevices().iterator();
        while (it.hasNext()) {
            BluetoothClass bluetoothClass = it.next().getBluetoothClass();
            if (bluetoothClass != null) {
                int deviceClass = bluetoothClass.getDeviceClass();
                if (bluetoothClass.hasService(262144) || deviceClass == 1028 || deviceClass == 1056 || deviceClass == 1032) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean m93492e() {
        return this.f89439d;
    }

    /* renamed from: f */
    public boolean m93493f() {
        try {
            if (((BluetoothManager) this.f89437b.getSystemService("bluetooth")).getAdapter().getState() != 12) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: h */
    public void m93494h(boolean z11) {
        if (z11) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: cp0.a
                @Override // java.lang.Runnable
                public final void run() {
                    C17553b.this.m93490g();
                }
            });
        } else {
            m93489d(false);
        }
    }

    /* renamed from: i */
    protected void m93495i(Context context) {
        this.f89437b = context;
        this.f89438c = (AudioManager) context.getSystemService("audio");
        if (this.f89436a == null) {
            try {
                this.f89436a = BluetoothAdapter.getDefaultAdapter();
            } catch (RuntimeException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }
}
