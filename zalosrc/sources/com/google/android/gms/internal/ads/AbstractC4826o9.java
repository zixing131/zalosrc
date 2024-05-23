package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.o9 */
/* loaded from: classes2.dex */
public abstract class AbstractC4826o9 extends AbstractC4788n8 {
    private final Object zza;
    private final InterfaceC4900q8 zzb;

    public AbstractC4826o9(int i11, String str, InterfaceC4900q8 interfaceC4900q8, InterfaceC4862p8 interfaceC4862p8) {
        super(i11, str, interfaceC4862p8);
        this.zza = new Object();
        this.zzb = interfaceC4900q8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4788n8
    public final C4937r8 zzh(C4639j8 c4639j8) {
        String str;
        String str2;
        try {
            byte[] bArr = c4639j8.f22715b;
            Map map = c4639j8.f22716c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i11 = 1;
                while (true) {
                    if (i11 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i11].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i11++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(c4639j8.f22715b);
        }
        return C4937r8.m25991b(str, AbstractC4530g9.m22303b(c4639j8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzz(String str) {
        InterfaceC4900q8 interfaceC4900q8;
        synchronized (this.zza) {
            interfaceC4900q8 = this.zzb;
        }
        interfaceC4900q8.zza(str);
    }
}
