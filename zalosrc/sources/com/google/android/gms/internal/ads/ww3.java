package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class ww3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m27731a(mt3 mt3Var) {
        StringBuilder sb2 = new StringBuilder(mt3Var.mo22168p());
        for (int i11 = 0; i11 < mt3Var.mo22168p(); i11++) {
            byte mo22166l = mt3Var.mo22166l(i11);
            if (mo22166l != 34) {
                if (mo22166l != 39) {
                    if (mo22166l != 92) {
                        switch (mo22166l) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (mo22166l >= 32 && mo22166l <= 126) {
                                    sb2.append((char) mo22166l);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((mo22166l >>> 6) & 3) + 48));
                                    sb2.append((char) (((mo22166l >>> 3) & 7) + 48));
                                    sb2.append((char) ((mo22166l & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}
