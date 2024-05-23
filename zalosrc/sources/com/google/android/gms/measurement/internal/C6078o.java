package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.AbstractC1388a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.o */
/* loaded from: classes.dex */
public final class C6078o extends AbstractC6062m5 {

    /* renamed from: c */
    private long f34246c;

    /* renamed from: d */
    private String f34247d;

    /* renamed from: e */
    private AccountManager f34248e;

    /* renamed from: f */
    private Boolean f34249f;

    /* renamed from: g */
    private long f34250g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6078o(C6127s4 c6127s4) {
        super(c6127s4);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6062m5
    /* renamed from: i */
    protected final boolean mo30816i() {
        Calendar calendar = Calendar.getInstance();
        this.f34246c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f34247d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final long m31181n() {
        mo31036g();
        return this.f34250g;
    }

    /* renamed from: o */
    public final long m31182o() {
        m31140j();
        return this.f34246c;
    }

    /* renamed from: p */
    public final String m31183p() {
        m31140j();
        return this.f34247d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final void m31184q() {
        mo31036g();
        this.f34249f = null;
        this.f34250g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean m31185r() {
        Account[] result;
        mo31036g();
        long mo105913a = this.f34158a.mo31031a().mo105913a();
        if (mo105913a - this.f34250g > 86400000) {
            this.f34249f = null;
        }
        Boolean bool = this.f34249f;
        if (bool == null) {
            if (AbstractC1388a.m6959a(this.f34158a.mo31032b(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f34158a.mo31033c().m31204y().m31108a("Permission error checking for dasher/unicorn accounts");
                this.f34250g = mo105913a;
                this.f34249f = Boolean.FALSE;
                return false;
            }
            if (this.f34248e == null) {
                this.f34248e = AccountManager.get(this.f34158a.mo31032b());
            }
            try {
                result = this.f34248e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException e11) {
                e = e11;
                this.f34158a.mo31033c().m31199s().m31109b("Exception checking account types", e);
                this.f34250g = mo105913a;
                this.f34249f = Boolean.FALSE;
                return false;
            } catch (OperationCanceledException e12) {
                e = e12;
                this.f34158a.mo31033c().m31199s().m31109b("Exception checking account types", e);
                this.f34250g = mo105913a;
                this.f34249f = Boolean.FALSE;
                return false;
            } catch (IOException e13) {
                e = e13;
                this.f34158a.mo31033c().m31199s().m31109b("Exception checking account types", e);
                this.f34250g = mo105913a;
                this.f34249f = Boolean.FALSE;
                return false;
            }
            if (result != null && result.length > 0) {
                this.f34249f = Boolean.TRUE;
                this.f34250g = mo105913a;
                return true;
            }
            Account[] result2 = this.f34248e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f34249f = Boolean.TRUE;
                this.f34250g = mo105913a;
                return true;
            }
            this.f34250g = mo105913a;
            this.f34249f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
