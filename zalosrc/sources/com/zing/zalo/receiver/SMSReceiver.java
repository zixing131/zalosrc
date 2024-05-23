package com.zing.zalo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.SmsMessage;
import android.telephony.TelephonyManager;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p348mi.AbstractC23304d;

/* loaded from: classes4.dex */
public class SMSReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final Pattern f49203b = Pattern.compile("(\\[|\\()Zalo(\\]|\\)).*[0-9]{3,}", 42);

    /* renamed from: c */
    private static final Pattern f49204c = Pattern.compile("[0-9]{3,}");

    /* renamed from: a */
    private Handler f49205a;

    public SMSReceiver() {
        this.f49205a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        try {
            if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    try {
                        Object[] objArr = (Object[]) extras.get("pdus");
                        int length = objArr.length;
                        SmsMessage[] smsMessageArr = new SmsMessage[length];
                        String str2 = null;
                        for (int i11 = 0; i11 < length; i11++) {
                            SmsMessage createFromPdu = SmsMessage.createFromPdu((byte[]) objArr[i11]);
                            smsMessageArr[i11] = createFromPdu;
                            String originatingAddress = createFromPdu.getOriginatingAddress();
                            String messageBody = smsMessageArr[i11].getMessageBody();
                            if (!originatingAddress.equalsIgnoreCase("VNG") && !originatingAddress.equalsIgnoreCase("6069")) {
                                originatingAddress.equalsIgnoreCase("+6069");
                            }
                            Matcher matcher = f49203b.matcher(messageBody);
                            while (true) {
                                if (matcher.find()) {
                                    Matcher matcher2 = f49204c.matcher(matcher.group());
                                    if (matcher2.find()) {
                                        str2 = matcher2.group();
                                        break;
                                    }
                                }
                            }
                        }
                        if (str2 != null && this.f49205a != null) {
                            Message message = new Message();
                            message.what = 0;
                            message.obj = str2;
                            this.f49205a.sendMessage(message);
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                }
                return;
            }
            if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
                String str3 = "";
                if (!intent.hasExtra("state")) {
                    str = "";
                } else {
                    str = intent.getStringExtra("state");
                }
                if (TelephonyManager.EXTRA_STATE_RINGING.equals(str) && C8937j0.m47663l("call_log_auto_otp") && intent.hasExtra("incoming_number")) {
                    if (intent.hasExtra("incoming_number")) {
                        str3 = intent.getStringExtra("incoming_number").trim();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("GlobalData.sInComingCallNum: ");
                    sb2.append(AbstractC23304d.f113289J.toString());
                    C8937j0.m47655c().m37627b(new SensitiveData("call_log_auto_otp", "core_otp"));
                    if (this.f49205a != null) {
                        Message message2 = new Message();
                        message2.what = 2;
                        message2.obj = str3;
                        this.f49205a.sendMessage(message2);
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public SMSReceiver(Handler handler) {
        this.f49205a = handler;
    }
}
