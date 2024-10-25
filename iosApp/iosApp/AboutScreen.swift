//
//  AboutScreen.swift
//  iosApp
//
//  Created by Jinyan Liu on 2024-10-19.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct AboutScreen: View {
    var body: some View {
      NavigationStack{
        AboutListView()
          .navigationTitle("About Device")
      }
    }
}

#Preview {
    AboutScreen()
}
